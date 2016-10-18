package Pages;

import Elements.Button;
import Enums.Variables;
import org.openqa.selenium.By;

public class Load_test
{
    private static Button hww_link=new Button(By.xpath(Variables.HOW_WE_WORK.toString()));

    public static void loadTest()
    {
        System.out.printf("%n[START] Thread Id : %s is started!",Thread.currentThread().getId());
        hww_link.click();
        System.out.printf("%n[END] Thread Id : %s",Thread.currentThread().getId());
    }
}
