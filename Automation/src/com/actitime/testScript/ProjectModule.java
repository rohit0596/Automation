package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass{

	@Test
	public void testCreateProject() {
		Reporter.log("CreateProject");
	}
	
	@Test
	public void testModifyProject() {
		Reporter.log("ModifyProject");
	}

}
