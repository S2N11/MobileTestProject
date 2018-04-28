package mobiletestproject.utils;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
	private static WebDriver driver;

	public static void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\opt\\chromedriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quit() {
		driver.quit();
	}

}
