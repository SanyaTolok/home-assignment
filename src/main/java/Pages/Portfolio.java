package Pages;
import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;

public class Portfolio extends Settings
{
    private static Button portfolio_link= new Button(By.xpath(Variables.PORTFOLIO_LINK.toString()));
    private static Button web_tab=new Button(By.xpath(Variables.WEB_DEVELOPMENT_TAB.toString()));
    private static Button mobile_tab=new Button(By.xpath(Variables.MOBILE_DEVELOPMENT_TAB.toString()));
    private static Button enterprise_tab =new Button(By.xpath(Variables.ENTERPRICE_SOFTWARE_TAB.toString()));
    private static Button cloud_tab=new Button(By.xpath(Variables.CLOUD_SOLUTION_TAB.toString()));
    private static Button all_tab=new Button(By.xpath(Variables.TAB_ALL.toString()));
    public static Portfolio tabs_exist_and_works()
    {
        portfolio_link.click();
        Settings.waitInSeconds(3);
        web_tab.click();
        Settings.waitInSeconds(3);
        mobile_tab.click();
        Settings.waitInSeconds(3);
        enterprise_tab.click();
        Settings.waitInSeconds(3);
        cloud_tab.click();
        Settings.waitInSeconds(3);
        all_tab.click();
        Settings.waitInSeconds(3);
        return new Portfolio();
    }
}
