package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import static MainSettings.Settings.getDriver;
import static MainSettings.Settings.waitInSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Element
{
    protected By by;

    public Element (By by)
    {
        this.by = by;
    }

    protected WebElement composeWebElement()
    {
        return getDriver().findElement(by);
    }

    public boolean isPresent ()
    {
        try
        {
            composeWebElement();
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public void waitForElementIsPresent()
    {
        for (int i=0; i<20; i++)
        {
            if (isPresent())
            {
                waitInSeconds(1);
                break;
            }
            else
            {
                waitInSeconds(1);
            }
        }
    }

    public boolean isClickable()
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(getDriver(), 3);
            wait.until(elementToBeClickable(getDriver().findElement(by)));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public short getAttribute(String id) {
        id= String.valueOf(Document.ATTRIBUTE_NODE);
        return Short.parseShort(id);
    }
}
