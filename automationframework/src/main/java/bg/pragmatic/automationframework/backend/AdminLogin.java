package bg.pragmatic.automationframework.backend;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bg.pragmatic.automationframework.utils.Browser;

public class AdminLogin {

	public static void goTo() {
		Browser.getDriver().get("http://shop.pragmatic.bg/admin");
	}

	
	/**
	 * When using this method you will be able to login into the backend of 
	 * the ecommerce website
	 * 
	 * @param username the username you would like to login with
	 * @param password the password you would like to login with
	 */
	public static void login(String username, String password) {
		WebElement usernameField = Browser.getDriver().findElement(By.name("username"));
		usernameField.sendKeys(username);
		
		Browser.getDriver().findElement(By.name("password")).sendKeys(password);
		
		Browser.getDriver().findElement(By.linkText("Login")).click();
	}


	public static void verifyValidationMessage(String messageOnFailure, String expectedValidationMessage) {
		String actualValidationMessage = Browser.getDriver().findElement(By.className("warning")).getText();
	
		Assert.assertEquals(messageOnFailure, expectedValidationMessage, actualValidationMessage);
	}

}
