package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiletestproject.utils.*;

public class MobileHomePage {

	public MobileHomePage() {

		PageFactory.initElements(Browser.driver(), this);
	}

	// *[@id="hdmylogin"]
	@FindBy(xpath = "//*[@id='hdmylogin']")
	static WebElement logInButton;

	public static void goTo() {
		Browser.driver().get("https://www.mobile.de/?lang=en");
	}

	public static void clickLogIn() {

		logInButton.click();

	}

}
