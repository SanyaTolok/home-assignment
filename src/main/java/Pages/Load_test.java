package Pages;

import Elements.Button;
import Enums.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Load_test
{
    private static Button hww_link=new Button(By.xpath(Variables.HOW_WE_WORK.toString()));
    private static Button business_model_fixed_time=new Button(By.xpath(Variables.FIXED_PRICE.toString()));
    private static Button business_model_dedicated_team=new Button(By.xpath(Variables.DEDICATED_TEAM.toString()));
    private static Button business_model_time_materials=new Button(By.xpath(Variables.TIME_MATERIALS.toString()));
    private static Button approaches_innovation_labs=new Button(By.xpath(Variables.INNOVATION_LABS.toString()));
    private static Button approaches_exhaustive_delivery=new Button(By.xpath(Variables.EXHAUSTIVE_DELIVERY.toString()));
    private static Button approaches_off_the_group=new Button(By.xpath(Variables.OFF_THE_GROUP.toString()));
    public static void loadTest()
    {
        System.out.printf("%n[START] Thread Id : %s is started!",Thread.currentThread().getId());
        WebDriver driver = new FirefoxDriver();
        driver.get("http://ddi-dev.com");
        hww_link.click();
        business_model_dedicated_team.click();
        business_model_time_materials.click();
        business_model_fixed_time.click();
        approaches_exhaustive_delivery.click();
        approaches_innovation_labs.click();
        approaches_off_the_group.click();
        System.out.printf("%n[END] Thread Id : %s",Thread.currentThread().getId());
        driver.quit();
    }
}
