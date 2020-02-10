package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_002_Testng 
{
	
		@Test
		public void login() throws Exception{
			DOMConfigurator.configure("log4j.xml");
			System.out.println("login completed");
		}
		@Test(dependsOnMethods="login")
		public void logout() 
		{
			DOMConfigurator.configure("log4j.xml");
			System.out.println("logout completed");
		}
		
}
