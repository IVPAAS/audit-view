package com.kaltura.example.audit;

import com.kaltura.testme.MainPanel;
import com.kaltura.testme.RequestPanel;
import com.kaltura.testme.ResponsPanel;

@SuppressWarnings("serial")
public class AuditTrailPanel extends MainPanel
{
	protected ResponsPanel getResponsPanel()
	{
		if(responsPanel == null)
			responsPanel = new AuditTrailResponsePanel();
		
		return responsPanel;
	}
	
	protected RequestPanel getRequestPanel()
	{
		RequestPanel requestPanel = new AuditTrailRequestPanel(getResponsPanel());
		requestPanel.setSize(600, 0);
		return requestPanel;
	}
}
