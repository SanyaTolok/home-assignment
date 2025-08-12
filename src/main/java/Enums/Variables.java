package Enums;

public enum Variables
{
    CHARTS_TAB_BUTTON("//button[@data-tab-item=\"charts\"]"),
    ATTRIBUTES_TAB_BUTTON("//button[@data-tab-item=\"attributes\"]"),
    DASHBOARD_TAB_BUTTON("//button[@data-tab-item=\"dashboard\"]"),
    ACCEPT_COOKIES_BUTTON("cookiescript_accept"),
    CLOSE_POPUP_BUTTON("//button[@aria-label=\"Close guide\"]"),
    POPUP_VIEW("//*[@id=\"userflow-ui\"]/div[1]/div[1]/div[1]/div[1]/iframe"),
    SEARCH_ATTRIBUTE_BOX("//input[@data-role=\"search-input\"]"), 
    ATTRIBUTE_VALUE("//div[@data-role=\"av-text-preview-body\"]"), 
    SEARCH_ATTRIBUTE_RESULT("//div[@data-role=\"menu-item\"]");
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
