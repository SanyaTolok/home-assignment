package Pages;

import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Management extends Settings
{
    private static Button ceo_facebook=new Button(By.xpath(Variables.CEO_FACEBOOK.toString()));
    private static Button ceo_linked_in=new Button(By.xpath(Variables.CEO_LINKED_IN.toString()));
    private static Button bdm_europa_facebook=new Button(By.xpath(Variables.BDM_EUROPA_FACEBOOK.toString()));
    private static Button bdm_europa_linked_in=new Button(By.xpath(Variables.BDM_EUROPA_LINKED_IN.toString()));
    private static Button bdm_america_facebook=new Button(By.xpath(Variables.BDM_AMERICA_FACEBOOK.toString()));
    private static Button bdm_america_linked_in=new Button(By.xpath(Variables. BDM_AMERICA_LINKED_IN.toString()));
    private static Button hdm_facebook=new Button(By.xpath(Variables.HMD_FACEBOOK.toString()));
    private static Button hmd_linked_in=new Button(By.xpath(Variables.HMD_LINKED_IN.toString()));
    private static Button pr_facebook=new Button(By.xpath(Variables.PR_FACEBOOK.toString()));
    private static Button pr_linked_in=new Button(By.xpath(Variables.PR_LINKED_IN.toString()));
    private static Button company_link=new Button(By.xpath(Variables.COMPANY_LINK.toString()));
    private static Button open_menu=new Button(By.xpath(Variables.OPEN_MENU.toString()));
    private static Button management_link=new Button(By.xpath(Variables.MANAGMENT_LINK.toString()));
    public static Management verify_links_CEO()
    {
        company_link.click();
        open_menu.click();
        management_link.click();
        WebElement ceo_facebook = driver.findElement(By.xpath(Variables.CEO_FACEBOOK.toString()));
        Actions newwin = new Actions(driver);
        newwin.keyDown(Keys.SHIFT).click(ceo_facebook).keyUp(Keys.SHIFT).build().perform();
        Settings.waitInSeconds(5);
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        String subWindowHandler2 = null;
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
            Assert.fail("Test failed 2");//show error message if link is incorrect

        }
        return new Management();
    }
    public static Management verify_links_bdm_Europa()
    {
        company_link.click();
        open_menu.click();
        management_link.click();
        return new Management();
    }
    public static Management verify_links_bdm_America()
    {
        company_link.click();
        open_menu.click();
        management_link.click();
        return new Management();
    }
    public static Management verify_links_head_marketing_department()
    {
        company_link.click();
        open_menu.click();
        management_link.click();
        return new Management();
    }
    public static Management verify_links_pr_manager()
    {
        company_link.click();
        open_menu.click();
        management_link.click();
        return new Management();
    }

}
