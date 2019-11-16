package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPO {

	WebDriver driver;

	public RegisterPO(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "userName")
	WebElement userName;

	@FindBy(name = "address1")
	WebElement address1;

	@FindBy(name = "address2")
	WebElement address2;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "postalCode")
	WebElement postalCode;

	public void enterDetails() {
		firstName.sendKeys("amol");
		lastName.sendKeys("kumar");
		phone.sendKeys("9090909090");
		userName.sendKeys("amol1312");
		address1.sendKeys("pune");
		address2.sendKeys("pune");
		city.sendKeys("pune");
		state.sendKeys("maharashtra");

	}
}
