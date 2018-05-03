package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import mobiletestproject.utils.*;

public class MobileHomePage {

	public MobileHomePage() {

		PageFactory.initElements(Browser.getDriver(), this);
	}

	@FindBy(xpath = ".//*[@id='hdmylogin']")
	static WebElement logInButton;

	public static void goTo() {
		Browser.getDriver().get("https://www.mobile.de/?lang=en");
	}

	public static void clickLogIn() {

		Browser.getDriver().findElement(By.xpath(".//*[@id='hdmylogin']")).click();

	}

}
