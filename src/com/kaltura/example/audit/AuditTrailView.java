package com.kaltura.example.audit;

import com.kaltura.testme.MainFrame;

public class AuditTrailView 
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MainFrame mainFrame = new MainFrame(new AuditTrailPanel());
		mainFrame.setVisible(true);
	}
}
