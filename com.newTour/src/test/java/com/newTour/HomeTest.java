package com.newTour;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.baseClass;
import PageObject.HomePO;

public class HomeTest extends baseClass {

	@Test
	public void test1() {

		HomePO hp = PageFactory.initElements(driver, HomePO.class);
		hp.clickRegister1();

	}

}
