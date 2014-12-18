package com.kaltura.example.audit;

import com.kaltura.testme.TableResponsPanel;

@SuppressWarnings("serial")
public class AuditTrailResponsePanel extends TableResponsPanel 
{
	@Override
    public String getColumnName(int col) {
        return super.getColumnName(col);
    }

	@Override
    public Object getValueAt(int row, int col) 
    {
    	Object value = super.getValueAt(row, col);

		String columnName = getColumnName(col);
		if(columnName == "parsedAt")
			return getDateValue(value);

    	return value;
    }
}
