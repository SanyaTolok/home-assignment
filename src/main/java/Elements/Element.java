package Elements;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import static MainSettings.Settings.getDriver;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class Element extends MainSettings.Settings {
    protected By by;

    public Element(By by) {
        this.by = by;
    }

    WebElement composeWebElement() {
        return getDriver().findElement(by);
    }

    public boolean isPresent() {
        try {
            composeWebElement();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public short getAttribute(String id) {
        id = String.valueOf(Document.ATTRIBUTE_NODE);
        return Short.parseShort(id);
    }

    public void enterText(String string) {
        composeWebElement().clear();
        composeWebElement().sendKeys(string);
    }

    public void enterKey(String string) {
        composeWebElement().sendKeys(string);
    }

    public void clearText() {
        composeWebElement().click();
        composeWebElement().clear();
    }

    public void click() {
        composeWebElement().click();
    }

    public void hover() {
        String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                "arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor)getDriver()).executeScript(javaScript, composeWebElement());
    }

    public void waitForElementToBeClickable(int i) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.elementToBeClickable(composeWebElement()));
    }

    public void waitForElementToBeVisible(int i) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.visibilityOf(composeWebElement()));
    }

    public void waitForElementToBePresent(int i) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
