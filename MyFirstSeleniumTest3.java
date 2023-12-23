package Seleniumwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstSeleniumTest3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws MalformedURLException {
        // 1. Creating a ChromeDriver instance directly
        ChromeDriver driver = new ChromeDriver();

        // 2. Commented-out code for visiting Google and printing page source
        //    Consider removing if not needed

        // 3. Creating a WebDriver instance and waiting until the URL contains "https://www.google.com"
        WebDriver driver1 = new ChromeDriver();
        new WebDriverWait(driver1, Duration.ofSeconds(60)).until(ExpectedConditions.urlContains("https://www.google.com"));

        // 4. Creating a SearchContext instance using ChromeDriver
        SearchContext driver2 = new ChromeDriver();

        // 5. Creating an Object instance (not recommended unless necessary)
        Object driver3 = new ChromeDriver();

        // 6. Creating a RemoteWebDriver instance for Selenium Grid
        //    Ensure the hub URL is correct and replace it if needed
        WebDriver driver4 = new RemoteWebDriver(new URL("http://selenium-grid-hub:4444/wd/hu"), new DesiredCapabilities());
    }
}
