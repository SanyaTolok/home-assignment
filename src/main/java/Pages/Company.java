package Pages;

import Elements.Button;

import Enums.Variables;
import MainSettings.Settings;
import MainSettings.Settings_for_Chrome;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Company extends Settings_for_Chrome {
    private static Button company_link=new Button(By.xpath(Variables.COMPANY_LINK.toString()));
    private static Button managment_link=new Button(By.xpath(Variables.MANAGMENT_LINK.toString()));
    private static Button software_link=new Button(By.xpath(Variables.SOFTWARE_DEVELOPMENT_LINK.toString()));
    private static Button open_menu=new Button(By.xpath(Variables.OPEN_MENU.toString()));
    public static Company company_links_present()
    {
        boolean test=false;
        company_link.click();
        String current_url= driver.getCurrentUrl();
        if(current_url.contains("http://ddi-dev.com/company/")) {
            open_menu.click();
            managment_link.click();
            open_menu.click();
            software_link.click();
            test = true;
            Assert.assertTrue(test==true,"Company link present and all link inside are found");


        }
            else
        {
        Assert.assertTrue(test==false,"Company link is not present");
        }
        return new Company();
    }
}
