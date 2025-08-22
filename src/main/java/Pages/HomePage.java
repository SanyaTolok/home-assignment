package Pages;
import org.openqa.selenium.By;
import org.testng.Assert;

import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;

public class HomePage extends Settings{

    public static void assertHomePage() {
        Button refresh = new Button(By.xpath(Variables.REFRESH_BUTTON.toString()));
        Assert.assertTrue(refresh.isPresent(), "Refresh button not present");
    }
    
}
