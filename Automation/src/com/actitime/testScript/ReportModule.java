package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ReportModule extends BaseClass {
	@Test 
	public void testCreateReport() {
		Reporter.log("CreateReport",true);
	}
	
//	@Test 
//	public void testDeleteReport() {
//		Reporter.log("DeleteReport",true);
//	}

}
