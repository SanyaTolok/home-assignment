package Pages;
import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Company extends Settings {
    private static Button company_link=new Button(By.xpath(Variables.COMPANY_LINK.toString()));
    public static Company company_links_present()
    {
        company_link.click();
        String current_url= driver.getCurrentUrl();
        if(current_url.contains("http://ddi-dev.com/company/")) {
           System.out.print("link eqaul to http://ddi-dev.com/company/");
             }
            else
        {
        Assert.fail("Company link is wrong");
        }

        return new Company();
    }
}
