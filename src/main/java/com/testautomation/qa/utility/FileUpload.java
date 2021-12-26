package com.testautomation.qa.utility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class FileUpload
{
	public void FileUploadFromSystem(String filenum) throws Exception
	{
		
		ClipboardOwner owner=null;
		String path= filenum;
		Robot robot= new Robot();
		StringSelection stringselection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, owner);
		//control +c
		
		robot.setAutoDelay(5000);
		// control +v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		// release control v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// enter press
		robot.keyPress(KeyEvent.VK_ENTER);
		
		// Enter Release
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.setAutoDelay(1000);
		
	}
	
	
}
