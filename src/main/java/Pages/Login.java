package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Elements.Button;
import Elements.Element;
import Enums.Variables;
import MainSettings.Settings;

public class Login extends Settings{

    public static void login() {
        Element emailInput = new Element(By.id(Variables.LOGIN_EMAIL_INPUT.toString()));
        emailInput.click();
        emailInput.clearText();
        emailInput.enterText(Variables.LOGIN_EMAIL.toString());
        Element passwordInput = new Element(By.id(Variables.LOGIN_PASSWORD_INPUT.toString()));
        passwordInput.click();
        passwordInput.clearText();
        passwordInput.enterText(Variables.LOGIN_PASSWORD.toString());
        Button loginButton = new Button(By.xpath(Variables.LOGIN_BUTTON.toString())); 
        loginButton.isPresent();
        loginButton.click();
        Element dashboardPanel = new Element(By.xpath(Variables.DASHBOARD_PANEL.toString()));
        dashboardPanel.isPresent();
        Assert.assertTrue(dashboardPanel.isPresent(), "Dashboard panel is not present, login might have failed");
    }

    public static void logOut(){
        Button avatarButton = new Button(By.xpath(Variables.AVATAR_BUTTON.toString()));
        avatarButton.click();
        Element logoutButton = new Element(By.xpath(Variables.LOGOUT_BUTTON.toString()));
        logoutButton.isPresent();
        logoutButton.hover();
        logoutButton.click();
        driver.getCurrentUrl().contains("login");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout might have failed");

    }
    
}
