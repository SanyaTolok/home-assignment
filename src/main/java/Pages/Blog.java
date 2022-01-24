package Pages;

import MainSettings.Settings;

public class Blog extends Settings {

    public static void get(String url) {
        getDriver().get(url);
        System.out.println("We testing");
    }
}
