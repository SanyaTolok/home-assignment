package Pages;
import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Company extends Settings {
    private static Button company_link=new Button(By.xpath(Variables.COMPANY_LINK.toString()));
    private static Button management_link=new Button(By.xpath(Variables.MANAGMENT_LINK.toString()));
    private static Button software_link=new Button(By.xpath(Variables.SOFTWARE_DEVELOPMENT_LINK.toString()));
    private static Button open_menu=new Button(By.xpath(Variables.OPEN_MENU.toString()));
    public static Company company_links_present()
    {
        boolean test=false;
        company_link.click();
        String current_url= driver.getCurrentUrl();
        if(current_url.contains("http://ddi-dev.com/company/")) {
            open_menu.click();
            management_link.click();
            Settings.waitInSeconds(2);
            open_menu.click();
            software_link.click();
             }
            else
        {
        Assert.assertTrue(test==true,"Company link is not present");
        }
        return new Company();
    }
}
