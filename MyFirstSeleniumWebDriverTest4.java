package Seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSeleniumWebDriverTest4 {
	public static void main(String[] args) {

		/*
		 * chrome--webdriver.chrome.driver-google -107,108
		 * Firefix--webdriver.gecko.driver-Mozila -108,109
		 * Edge--webdriver.edge.driver
		 */

		// below steps are only required if we using 4.5.0 or below

		// Option-1:Manually maintain driver
		/*
		 * System.setProperty("webdriver.chrome.driver"),
		 * "C:\\Users\\sagni\\Downloads\\chromedriver_win32");
		 */

		// option-2:use wdm : webdriver manager
		// check browser versiom,check do we have driver ,download,cache ,build path
		WebDriverManager.firefoxdriver().setup();
		;
		WebDriverManager.chromedriver().setup();

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");

		WebDriver driver2 = new FirefoxDriver();

		driver2.get("https://www.google.com");

		driver1.quit();

		new WebDriverWait(driver1, Duration.ofSeconds(60)).until(ExpectedConditions.urlContains("https://www.google.com"));

	}
}