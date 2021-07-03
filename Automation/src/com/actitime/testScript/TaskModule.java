package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TaskModule extends BaseClass {

	@Test
	public void testCreateTask() {
		Reporter.log("CreateTask");
	}
	@Test
	public void testModifyTask() {
		Reporter.log("ModifyTask");
	}
}
