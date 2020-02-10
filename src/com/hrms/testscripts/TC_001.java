package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC_001 {
	public static void main(String args[]) throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
	//test case steps
		g.openapplication();
		g.login();
		g.addemp();
		g.delemp();
		g.logout();
		g.closebrowser();
	}
	}


