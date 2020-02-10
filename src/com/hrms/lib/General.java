package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;

public class General extends Global {
	
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	}
public void login() throws Exception {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	Thread.sleep(3000);
	 }

public void addemp() {
	System.out.println("adding new emp");
	Log.info("add new emp");
}
public void delemp() {
	System.out.println("delete emp");
	Log.info("del emp");
}
public void logout() throws Exception {
	driver.findElement(By.linkText(link_logout)).click();
	Thread.sleep(3000);
}
public void closebrowser() {
	driver.quit();
}
}
