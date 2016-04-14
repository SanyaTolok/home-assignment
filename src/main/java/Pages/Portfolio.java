package Pages;

import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;

import org.openqa.selenium.By;

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
    public static Portfolio get_more_info()
    {
        portfolio_link.click();
        get_more.click();
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
}
