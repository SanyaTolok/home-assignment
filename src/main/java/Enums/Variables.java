package Enums;

public enum Variables
{
    LOGIN_EMAIL_INPUT("email"),
    LOGIN_EMAIL("superadmin@gmail.com"),
    LOGIN_PASSWORD("Qwerty123!"),
    LOGIN_PASSWORD_INPUT("password"),
    DASHBOARD_PANEL("//ul[@class=\"menu-sidebar-list\"]"),
    AVATAR_BUTTON("//button[@class=\"header-avatar\"]"),
    LOGOUT_BUTTON("//ul[@class=\"header-menu\"]"),
    LOGIN_BUTTON("//button[@class=\"btn primary\"]"), 
    REFRESH_BUTTON("//button[@class=\"btn refresh\"]");
    private String text;
    Variables(String text)
    {
        this.text=text;
    }

    public String toString()
    {

        return this.text;
    }
}
