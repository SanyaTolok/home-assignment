package Asserts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Elements.Button;
import Elements.Element;
import Enums.Variables;
import MainSettings.Settings;

public class AssertsAttributes extends Settings {

     public static void assertAttributesPageTabs() {
       
    }

        public static void assertAttributeFound(String expectedAttributeName) {
        Element attribute = new Element(By.xpath(Enums.Variables.SEARCH_ATTRIBUTE_RESULT.toString()));
        Assert.assertTrue(attribute.isPresent(), "Attribute not found");
        WebElement webElement = driver.findElement(By.xpath(Enums.Variables.SEARCH_ATTRIBUTE_RESULT.toString()));
        String value = webElement.getAttribute("data-name");
        log.info("Attribute value is: " + value);
        Assert.assertEquals(value, expectedAttributeName, "Attribute name does not match expected value");
    }

    public static void assertAttributeTag(String expectedAttributeName) {
        boolean tagExists = false;
        List<WebElement> webElements = driver.findElements(By.xpath("//div[@data-role=\"tag\"]"));
        for (WebElement element : webElements) {
            String tagValue = element.getAttribute("data-tag");
            if (tagValue.equals(expectedAttributeName)) {
                log.info("Attribute tag found: " + expectedAttributeName);
                tagExists = true;
                return;
            }}
            Assert.assertTrue(tagExists, "Attribute tag not found: " + expectedAttributeName);
    }


     public static void assertAttributeNotFound() {
        Element attribute = new Element(By.xpath(Enums.Variables.NO_SEARCH_RESULTS_TEXT.toString()));
        Assert.assertTrue(attribute.isPresent(), "Attribute not found");   
        String value = Element.getElementText(driver, By.xpath(Variables.NO_SEARCH_RESULTS_TEXT.toString()), 10);
        log.info("Attribute value is: " + value);
        Assert.assertEquals(value, "No matching results", "Attribute name does not match expected value");
    }


    public static void assertCoockiesDialogShown(){
        log.info("Checking if cookies dialog is present");
        Button button = new Button(By.id(Enums.Variables.ACCEPT_COOKIES_BUTTON.toString()));
        Assert.assertTrue(button.isPresent(), "Cookies dialog is not present");
    }

    public static void assertChartDiagram(){
        Element charElement = new Element(By.xpath(Enums.Variables.CHART_DIAGRAM.toString()));
        Assert.assertTrue(charElement.isPresent(), "Diagram not present in DOM tree");
    }

    public static void assertAttributeValue(String expectedValue) {
        Element valueEl = new Element(By.className("text-preview-content"));
        Assert.assertTrue(valueEl.isPresent(), "Value not present");
        String value = Element.getElementText(driver, By.className("text-preview-content"), 10);
        log.info("Attribute value is: " + value);
        Assert.assertEquals(value, expectedValue, "Attribute value does not match expected value");
    }

    }
