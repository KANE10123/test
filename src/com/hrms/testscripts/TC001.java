package com.hrms.testscripts;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.*;
import com.utility.Log;

@Test public class TC001 {

//	public static void main(String args[]) {
	public void TC001() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General driver = new General();
		driver.openApplication();
		driver.login();
		driver.addEmp();
		driver.delmp();
		driver.Logout();
	    driver.closeApplication();
	   
	}
}
