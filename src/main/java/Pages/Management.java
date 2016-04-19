package Pages;

import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;

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
