package pageobjects;

import mobiletestproject.utils.Browser;

public class MobileHomePage {
	
	public static void goTo() {
		Browser.getDriver().get("https://www.mobile.de/?lang=en");
	}


}
