package mobiletestproject.utils;

import org.junit.Before;
import org.junit.Test;

import pageobjects.MobileHomePage;

public class MobileHomePageTests {
	@Before
	public void setup() {
		Browser.initBrowser();
	}

	@Test
	public void successfulLogin() throws InterruptedException {
		MobileHomePage.goTo();
		Thread.sleep(5000);
		MobileHomePage.clickLogIn();
	}
}