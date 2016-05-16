package Pages;

import Elements.Button;
import Enums.Variables;
import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class How_We_Work extends MainSettings.Settings
{
    private static Button hww_link=new Button(By.xpath(Variables.HOW_WE_WORK.toString()));
    private static Button business_model_fixed_time=new Button(By.xpath(Variables.FIXED_PRICE.toString()));
    private static Button business_model_dedicated_team=new Button(By.xpath(Variables.DEDICATED_TEAM.toString()));
    private static Button business_model_time_materials=new Button(By.xpath(Variables.TIME_MATERIALS.toString()));
    private static Button approaches_innovation_labs=new Button(By.xpath(Variables.INNOVATION_LABS.toString()));
    private static Button approaches_exhaustive_delivery=new Button(By.xpath(Variables.EXHAUSTIVE_DELIVERY.toString()));
    private static Button approaches_off_the_group=new Button(By.xpath(Variables.OFF_THE_GROUP.toString()));
    public static void how_we_work_present() {
        WebElement how_we_work_link = null;

        try {
            how_we_work_link = getDriver().findElement(By.xpath(Variables.HOW_WE_WORK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(how_we_work_link != null, "Test case is FAILED - BLOG LINK is ABSENT!!!");

    }
    public static How_We_Work change_tabs()
    {
        hww_link.click();
        waitInSeconds(2);
        business_model_dedicated_team.click();
        business_model_time_materials.click();
        business_model_fixed_time.click();
        approaches_exhaustive_delivery.click();
        approaches_innovation_labs.click();
        approaches_off_the_group.click();
        return new How_We_Work();
    }
}
