package Elements;
import org.openqa.selenium.By;

public class CheckBox extends Element
{

    public CheckBox(By by) {
        super(by);
    }

    public void click()
    {
        composeWebElement().click();
    }

    public boolean isChecked()
    {
        return composeWebElement().isSelected();
    }
}
