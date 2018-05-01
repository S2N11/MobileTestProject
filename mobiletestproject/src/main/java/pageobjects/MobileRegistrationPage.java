package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileRegistrationPage {

	private WebDriver driver;

	public MobileRegistrationPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	WebElement emailField;

	public void createAccount() {

	}

}
