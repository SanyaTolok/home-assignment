package Pages;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Elements.Button;
import Elements.Element;
import Elements.TextField;
import MainSettings.Settings;

public class Attributes extends Settings {

     public static void closeDialog(){
        log.info("Checking if dialog is present");
        Element dialog = new Element(By.xpath(Enums.Variables.POPUP_VIEW.toString()));
        dialog.waitForElementToBeVisible(10);
        if (dialog.isPresent()) {
            log.info("Dialog is present");
            WebElement iframeDialog=driver.findElement(By.xpath("//*[@id=\"userflow-ui\"]/div[1]/div[1]/div[1]/div[1]/iframe"));
            driver.switchTo().frame(iframeDialog);
            Button closeButton = new Button(By.xpath(Enums.Variables.CLOSE_POPUP_BUTTON.toString()));
            closeButton.click();
            driver.switchTo().defaultContent();
            log.info("Dialog closed");
        }
         else {
            log.info("Dialog is not present");
            throw new AssertionError("Dialog is not present");
        }
    }

    public static void searchForAttribute(String attributeName) {
        log.info("Searching for attribute: " + attributeName);
        TextField searchBox = new TextField(By.xpath(Enums.Variables.SEARCH_ATTRIBUTE_BOX.toString()));
        searchBox.waitForElementToBeVisible(10);
        searchBox.enterText(attributeName);
        log.info("Search completed for attribute: " + attributeName);
    }
}
