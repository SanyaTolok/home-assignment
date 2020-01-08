package Elements;

import org.openqa.selenium.By;

public class TextField extends Element {
    public TextField(By by) {
        super(by);
    }

    public void enterText(String string) {
        composeWebElement().clear();
        composeWebElement().sendKeys(string);
    }

    public void clear() {
        composeWebElement().clear();
    }

    public void click() {
        composeWebElement().click();
    }
}
