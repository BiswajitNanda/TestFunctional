package ebay.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver Driver;

    public static WebDriver getDriver() {
        String sys = System.getenv("environment");
        switch (sys) {
            case "macChrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/ebay/drivers/chromedriver_mac");
                Driver = new ChromeDriver();
                break;
            case "windowsChrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/ebay/drivers/chromedriver.exe");
                Driver = new ChromeDriver();
                break;
            case "macFirefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/ebay/drivers/geckodriver");
                Driver = new FirefoxDriver();
        }

        return Driver;
    }


}
