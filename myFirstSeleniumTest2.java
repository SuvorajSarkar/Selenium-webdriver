package Seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstSeleniumTest2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// capture the details in the form of String
		String Title = driver.getTitle();

		System.out.println("TITLE IS " + Title);

		String URL = driver.getCurrentUrl();

		System.out.println("CURRENT URL IS " + URL);

		driver.get("https://www.yahoo.com");

		System.out.println("TITLE IS " +driver.getTitle());

		System.out.println("CURRENT URL IS " + driver.getCurrentUrl());
		driver.get("https://www.facebook.com");

		System.out.println("TITLE IS " + driver.getTitle());

		System.out.println("CURRENT URL IS " + driver.getCurrentUrl());
		driver.get("https://www.youtube.com");

		System.out.println("TITLE IS " + driver.getTitle());

		System.out.println("CURRENT URL IS " + driver.getCurrentUrl());

		// close all associated window
		driver.quit();
		// close active tab or window
		driver.close();

	}
}
