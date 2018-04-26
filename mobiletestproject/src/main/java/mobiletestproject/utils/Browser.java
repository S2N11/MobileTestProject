package mobiletestproject.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	private static WebDriver driver;

	public static void initBrowser() {
		// System.setProperty("webdriver.chrome.driver", "C:\\opt\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\opt\\geckodriver.exe");

		// driver = new ChromeDriver()
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quit() {
		driver.quit();
	}

}
