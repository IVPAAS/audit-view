package com.kaltura.example.audit;

import java.lang.reflect.Method;

import com.kaltura.client.services.KalturaAuditTrailService;
import com.kaltura.client.types.KalturaAuditTrailFilter;
import com.kaltura.client.types.KalturaFilterPager;
import com.kaltura.testme.RequestPanel;
import com.kaltura.testme.ResponsPanel;
import com.kaltura.testme.data.KalturaAction;
import com.kaltura.testme.data.KalturaAttribute;

@SuppressWarnings("serial")
public class AuditTrailRequestPanel extends RequestPanel
{
	public AuditTrailRequestPanel(ResponsPanel responsPanel) 
	{
		super(responsPanel);
		
		addAuditListAction();
	}

	private void addAuditListAction()
	{
		Method action;
		try {
			action = KalturaAuditTrailService.class.getMethod("list", KalturaAuditTrailFilter.class, KalturaFilterPager.class);
		} catch (SecurityException e) {
			e.printStackTrace();
			return;
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return;
		}
		
		kalturaAction = new KalturaAction(kalturaClient.getAuditTrailService(), action);
		KalturaAttribute filterAttribute = kalturaAction.add("filter", KalturaAuditTrailFilter.class);
		KalturaAttribute pagerAttribute = kalturaAction.add("pager", KalturaFilterPager.class);
		
		pagerAttribute.setUsed(true);
		KalturaFilterPager pager = (KalturaFilterPager) pagerAttribute.getValue();
		pager.pageSize = 30;
		pager.pageIndex = 1;
		
		objectsFormPanel.load(pagerAttribute);
		objectsFormPanel.addObject(filterAttribute, "filter (KalturaAuditTrailFilter)", true);
		

		objectsFormPanel.updateUI();
	}
}
