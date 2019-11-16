package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePO {

	WebDriver d;

	public HomePO(WebDriver driver) {
		d = driver;
	}

	@FindBy(xpath = "//*[text()=\"REGISTER\"]")
	WebElement registerlink;

	public void clickRegister1() {
		registerlink.click();

	}
}
