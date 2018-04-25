package bg.pragmatic.automationframework.backend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.automationframework.utils.Browser;

public class AdminLoginTests {
	
	@Before
	public void setup(){
		Browser.initBrowser();
	}
	
	@Test
	public void successfulLogin(){
		AdminLogin.goTo();
		AdminLogin.login("admin", "parola");
		
		AdminDashboard.verifyTitle("You were not logged in.", "Dashboard");
	}
	
	@Test
	public void unsuccessfulLogin(){
		AdminLogin.goTo();
		AdminLogin.login("sdfdaf", "dsfasfds");
		
		AdminLogin.verifyValidationMessage("The validation message was not present.", "No match for Username and/or Password.");
	}
	
	@After
	public void tearDown(){
		Browser.quit();
	}

}
