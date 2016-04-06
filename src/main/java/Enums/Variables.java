package Enums;
public enum Variables
{
    //HomePage
    SUBSCRIPTION_POPUP(".//*[@id='subscribeModal']/div/div/div[1]/button"),
    SERVICES_LINK(".//*[@id='nav']/ul/li[1]/a"),
    COMPANY_LINK(".//*[@id='nav']/ul/li[2]/a"),
    TECHNOLOGY_LINK(".//*[@id='nav']/ul/li[3]/a"),
    PORTFOLIO_LINK(".//*[@id='nav']/ul/li[4]/a"),
    BLOG_LINK(".//*[@id='nav']/ul/li[5]/a"),
    CONTACTS_LINK(".//a[text()='Contacts']"),
    START_PROJECT(".//*[@id='main']/section/span/span/div/div/a");
    private String text;
    private Variables(String text)
    {
        this.text=text;
    }

    public String toString()
    {

        return this.text;
    }
}
