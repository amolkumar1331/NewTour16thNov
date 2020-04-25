package com.newTour;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.baseClass;
import PageObject.RegisterPO;

public class RegisterTest extends baseClass {

	@Test
	public void test2() {
		RegisterPO rp = PageFactory.initElements(driver, RegisterPO.class);
		rp.enterDetails();
	}

}
