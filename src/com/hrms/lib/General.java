package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;


public class General extends Global {
//re-usable fun:
	public void openApplication() {
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		Log.info("Application opened");
		
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application Closed");
	}
	
	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(5000);
	}
	public void Logout() {
		driver.findElement(By.linkText(link_logout)).click();
		Log.info("Application Logout");
	}
	public void addEmp() {
		
			System.out.println("adding new emp");
			Log.info("add emp");
	}
	public void delmp(){
		System.out.println("delete emp");
		Log.info("del emp");
	}
}
