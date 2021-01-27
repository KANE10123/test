package com.hrms.testscripts;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.*;
import com.utility.Log;
public class TC002 {

//	public static void main(String[] args) {
		@Test public void TC002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General d = new General();
		d.openApplication();
		d.login();
		d.Logout();
		d.closeApplication();
		

	}

}
