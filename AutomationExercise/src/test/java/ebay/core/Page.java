package ebay.core;

import org.apache.bcel.generic.DREM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

public class Page extends DriverFactory {

    public void open(String Url) {
        Driver.navigate().to(Url);
    }

    public WebElement findCss(String expression) {
        return Driver.findElement(By.cssSelector(expression));
    }

    public WebElement findXpath(String expression) {
        return Driver.findElement(By.xpath(expression));
    }

    public WebElement findLinkText(String text) {
        return Driver.findElement(By.linkText(text));
    }


    public void close() {
        Driver.quit();
    }

    public void executeJavascript(String expression) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver;
        return;
    }
    public void verify(String expectedValue)
    {
        assertTrue(Driver.findElement(By.xpath("")).getText().contains(expectedValue));
    }


}
