package Pages;
import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;
public class Management extends Settings
{

    private static Button ceo_linked_in=new Button(By.xpath(Variables.CEO_LINKED_IN.toString()));
    private static Button bdm_europa_linked_in=new Button(By.xpath(Variables.BDM_EUROPA_LINKED_IN.toString()));
    private static Button bdm_america_linked_in=new Button(By.xpath(Variables.BDM_AMERICA_LINKED_IN.toString()));
    private static Button hmd_linked_in=new Button(By.xpath(Variables.HMD_LINKED_IN.toString()));
    private static Button pr_linked_in=new Button(By.xpath(Variables.PR_LINKED_IN.toString()));

    public static Management verify_links_CEO()
    {
        Actions action = new Actions(driver);
        WebElement management = driver.findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        action.moveToElement(management).moveToElement(driver.findElement(By.xpath(Variables.MANAGMENT_LINK.toString()))).click().build().perform();
        WebElement ceo_facebook = driver.findElement(By.xpath(Variables.CEO_FACEBOOK.toString()));
        Actions newwin = new Actions(driver);
        newwin.keyDown(Keys.SHIFT).click(ceo_facebook).keyUp(Keys.SHIFT).build().perform();
        Settings.waitInSeconds(2);
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();

        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_facebook = driver.getCurrentUrl();
        if(url_facebook.contains("https://www.facebook.com/andrey.davidov.524?fref=ts")) {
            driver.close();
        }
        else
        {
            Assert.fail("Test failed");//show error message if link is incorrect

        }
        driver.switchTo().window(parentWindowHandler);
        ceo_linked_in.click();
        String url_linkedin = driver.getCurrentUrl();
        if(url_linkedin.contains("https://www.linkedin.com/in/andrey-davidov-3518921a"))
        {
            System.out.print("link equal to https://www.linkedin.com/in/andrey-davidov-3518921a");
        }
        else
        {
            Assert.fail("Test failed, linkedin link incorrect");//show error message if link is incorrect

        }
        return new Management();
    }
    public static Management verify_links_bdm_Europa()
    {
        Actions action = new Actions(driver);
        WebElement management = driver.findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        action.moveToElement(management).moveToElement(driver.findElement(By.xpath(Variables.MANAGMENT_LINK.toString()))).click().build().perform();
        WebElement bdm_facebook = driver.findElement(By.xpath(Variables.BDM_EUROPA_FACEBOOK.toString()));
        Actions newwin = new Actions(driver);
        newwin.keyDown(Keys.SHIFT).click(bdm_facebook).keyUp(Keys.SHIFT).build().perform();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();

        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_facebook_bdm = driver.getCurrentUrl();
        if(url_facebook_bdm.contains("https://www.facebook.com/roma.dereka")) {
            driver.close();
            driver.switchTo().window(parentWindowHandler);
        }
        else
        {
            Assert.fail("Test failed");//show error message if link is incorrect

        }
        Settings.waitInSeconds(2);
        driver.navigate().refresh();
        bdm_europa_linked_in.click();
        Settings.waitInSeconds(2);
        String url_linkedin = driver.getCurrentUrl();
        if(url_linkedin.contains("https://ua.linkedin.com/in/roman-dereka-89a80259"))
        {
            System.out.print("link equal to https://ua.linkedin.com/in/roman-dereka-89a80259");
        }
        else
        {
            Assert.fail("Test failed, linkedin link incorrect");//show error message if link is incorrect

        }
        return new Management();
    }
//    public static Management verify_links_bdm_America()
//    {
//        Actions action = new Actions(driver);
//        WebElement management = driver.findElement(By.xpath(Variables.COMPANY_LINK.toString()));
//        action.moveToElement(management).moveToElement(driver.findElement(By.xpath(Variables.MANAGMENT_LINK.toString()))).click().build().perform();
//        WebElement bdm_america_facebook = driver.findElement(By.xpath(Variables.BDM_AMERICA_FACEBOOK.toString()));
//        Actions newwin3 = new Actions(driver);
//        newwin3.keyDown(Keys.SHIFT).click(bdm_america_facebook).keyUp(Keys.SHIFT).build().perform();
//        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//        String subWindowHandler = null;
//        Set<String> handles = driver.getWindowHandles(); // get all window handles
//        Iterator<String> iterator = handles.iterator();
//        while(iterator.hasNext())
//        {
//            subWindowHandler = iterator.next();
//
//        }
//        driver.switchTo().window(subWindowHandler); // switch to popup window
//        String url_facebook = driver.getCurrentUrl();
//        Settings.waitInSeconds(5);
//        if(url_facebook.contains("https://www.facebook.com/shyhimaha")) {
//            driver.close();
//            driver.switchTo().window(parentWindowHandler);
//        }
//        else
//        {
//            Assert.fail("Test failed");//show error message if link is incorrect
//
//        }
//        Settings.waitInSeconds(2);
//        driver.navigate().refresh();
//        bdm_america_linked_in.click();
//        String url_linkedin = driver.getCurrentUrl();
//        if(url_linkedin.contains("https://ua.linkedin.com/in/antonshygimaga"))
//        {
//            System.out.print("link equal to https://ua.linkedin.com/in/antonshygimaga");
//        }
//        else
//        {
//            Assert.fail("Test failed, linkedin link incorrect");//show error message if link is incorrect
//
//        }
//        return new Management();
//    }

    public static Management verify_links_head_marketing_department()
    {
        Actions action = new Actions(driver);
        WebElement management = driver.findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        action.moveToElement(management).moveToElement(driver.findElement(By.xpath(Variables.MANAGMENT_LINK.toString()))).click().build().perform();
        WebElement head_facebook = driver.findElement(By.xpath(Variables.HMD_FACEBOOK.toString()));
        Actions newwin = new Actions(driver);
        newwin.keyDown(Keys.SHIFT).click(head_facebook).keyUp(Keys.SHIFT).build().perform();
        Settings.waitInSeconds(5);
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();

        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_facebook = driver.getCurrentUrl();
        if(url_facebook.contains("https://www.facebook.com/alex.kuzenko1")) {
            driver.close();
            driver.switchTo().window(parentWindowHandler);
        }
        else
        {
            Assert.fail("Test failed");//show error message if link is incorrect

        }
        Settings.waitInSeconds(2);
        driver.navigate().refresh();
        hmd_linked_in.click();
        String url_linkedin = driver.getCurrentUrl();
        if(url_linkedin.contains("https://ua.linkedin.com/in/alexey-kutsenko-12807566"))
        {
            System.out.print("link equal to https://ua.linkedin.com/in/alexey-kutsenko-12807566");
        }
        else
        {
            Assert.fail("Test failed, linkedin link incorrect");//show error message if link is incorrect

        }
        return new Management();
    }
    public static Management verify_links_pr_manager()
    {
        Actions action = new Actions(driver);
        WebElement management = driver.findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        action.moveToElement(management).moveToElement(driver.findElement(By.xpath(Variables.MANAGMENT_LINK.toString()))).click().build().perform();
        WebElement pr_facebook = driver.findElement(By.xpath(Variables.PR_FACEBOOK.toString()));
        Actions newwin = new Actions(driver);
        newwin.keyDown(Keys.SHIFT).click(pr_facebook).keyUp(Keys.SHIFT).build().perform();
        Settings.waitInSeconds(5);
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();

        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_facebook = driver.getCurrentUrl();
        if(url_facebook.contains("https://www.facebook.com/marisha.blinova")) {
            driver.close();
        }
        else
        {
            Assert.fail("Test failed");//show error message if link is incorrect

        }
        driver.switchTo().window(parentWindowHandler);
        pr_linked_in.click();
        String url_linkedin = driver.getCurrentUrl();
        if(url_linkedin.contains("https://ua.linkedin.com/in/marina-blinova-1b9385103"))
        {
            System.out.print("link equal to https://ua.linkedin.com/in/marina-blinova-1b9385103");
        }
        else
        {
            Assert.fail("Test failed, linkedin link incorrect");//show error message if link is incorrect

        }
        return new Management();
    }

}
