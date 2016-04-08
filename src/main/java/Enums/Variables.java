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
    START_PROJECT(".//*[@id='main']/section/span/span/div/div/a"),
    //Contact Us Now form
    NAME_INPUT(".//*[@id='contact-form']/div/input[1]"),
    EMAIL_INPUT(".//*[@id='contact-form']/div/input[2]"),
    PHONE_INPUT(".//*[@id='contact-form']/div/input[3]"),
    MESSAGE_TEXTFIELD(".//*[@id='contact-form']/div/textarea"),
    SENT_BUTTON(".//*[@id='contact-form']/div/div[2]/button");
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
