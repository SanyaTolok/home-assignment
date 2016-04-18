package Pages;

import Elements.Button;
import Elements.Element;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Enums.Variables.PORTFOLIO_ARTICLE;
import static Enums.Variables.SEND_SERVICES_FORM;

public class Portfolio extends Settings{
    private static Button get_more=new Button(By.xpath(Variables.GET_MORE_BUTTON.toString()));
    private static Button portfolio_link= new Button(By.xpath(Variables.PORTFOLIO_LINK.toString()));
    private static Button mobile= new Button(By.xpath(Variables.MOBILE.toString()));
    private static Button web= new Button(By.xpath(Variables.WEB.toString()));
    private static Button cloud= new Button(By.xpath(Variables.CLOUD.toString()));
    private static Button send=new Button(By.xpath(Variables.SEND.toString()));
    private static TextField name=new TextField(By.xpath(Variables.PORTFOLIO_NAME.toString()));
    private static TextField email=new TextField(By.xpath(Variables.PORFOLIO_EMAIL.toString()));
    private static Button web_tab=new Button(By.xpath(Variables.WEB_DEVELOPMENT_TAB.toString()));
    private static Button mobile_tab=new Button(By.xpath(Variables.MOBILE_DEVELOPMENT_TAB.toString()));
    private static Button eterprice_tab=new Button(By.xpath(Variables.ENTERPRICE_SOFTWARE_TAB.toString()));
    private static Button cloud_tab=new Button(By.xpath(Variables.CLOUD_SOLUTION_TAB.toString()));
    private static Button all_tab=new Button(By.xpath(Variables.TAB_ALL.toString()));
    private static Button article_portfolio=new Button(By.xpath(Variables.PORTFOLIO_ARTICLE.toString()));
    private static Button next=new Button(By.xpath(Variables.NEXT_PAGE_PORTFOLIO.toString()));
    private static Button previous= new Button(By.xpath(Variables.PREVIOUS_PAGE_PORTFOLIO.toString()));
    public static Portfolio get_more_info()
    {
        portfolio_link.click();
        get_more.click();
        Settings.waitInSeconds(2);
        mobile.click();
        web.click();
        cloud.click();
        name.enterText("DDI DEV TEST");
        email.enterText("ddi-dev@test.com");
        send.click();
        return new Portfolio();
    }
    public static Portfolio tabs_exsist_and_works()
    {
        portfolio_link.click();
        web_tab.click();
        mobile_tab.click();
        eterprice_tab.click();
        cloud_tab.click();
        all_tab.click();
        return new Portfolio();
    }
    public static Portfolio paging_portfolio()
    {
        portfolio_link.click();
        Settings.waitInSeconds(2);
        mobile_tab.click();
        try
        {
            WebElement article = driver.findElement(By.xpath(Variables.PORTFOLIO_ARTICLE.toString()));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", article);
            article_portfolio.click();
        }
        catch (ElementNotVisibleException e)
        {
            Assert.fail("button is not visible it is impossible to hover on it");
        }

        next.click();
        previous.click();
        return new Portfolio();
    }
}
