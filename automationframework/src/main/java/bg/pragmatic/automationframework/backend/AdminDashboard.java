package bg.pragmatic.automationframework.backend;

import org.junit.Assert;

import bg.pragmatic.automationframework.utils.Browser;

public class AdminDashboard {

	public static void verifyTitle(String messageOnFailure, String expectedTitle) {
		String actualTitle = Browser.getDriver().getTitle();
		
		Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
	}

}
