package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static MainSettings.Settings.waitInSeconds;

public class CheckBox extends Element {

    public CheckBox(By by) {
        super(by);
    }

    public void click() {
        composeWebElement().click();
    }

    public boolean isChecked() {
        try {
            composeWebElement().isSelected();
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
    }}

    public boolean isPresent() {
        try {
            composeWebElement();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void waitForElementIsPresent() {
        for (int i = 0; i < 20; i++) {
            if (isPresent()) {
                waitInSeconds(1);
                break;
            } else {
                waitInSeconds(1);
            }
        }
    }
}