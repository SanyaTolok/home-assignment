package Enums;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;

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
    SUBSCRIBE(".//*[@id='email-subscribe']"),
    SIGN_UP(".//*[@id='footer']/div[1]/div/form/fieldset/div[2]/input[2]"),
    CONGRATS("html/body/div[2]/div/div/div/p"),
    //Portfolio
    GET_MORE_BUTTON("html/body/div[3]/div/div[1]/div[2]/div[2]/button"),
    MOBILE(".//*[@id='request-form']/div/div/div[1]/div/div[1]/label/span"),
    WEB(".//*[@id='request-form']/div/div/div[1]/div/div[2]/label/span"),
    CLOUD(".//*[@id='request-form']/div/div/div[1]/div/div[3]/label/span"),
    PORTFOLIO_NAME(".//*[@id='mob-body']/div/input[1]"),
    PORFOLIO_EMAIL(".//*[@id='mob-body']/div/input[2]"),
    SEND(".//*[@id='mob-body']/div/div[2]/button"),
    //Start project form1
    START_PROJECT_NAME(".//*[@id='requestFormModal']/div/div/div[2]/form/div[2]/input"),
    START_PROJECT_EMAIL(".//*[@id='requestFormModal']/div/div/div[2]/form/div[3]/input"),
    START_PROJECT_PHONE(".//*[@id='requestFormModal']/div/div/div[2]/form/div[4]/input"),
    START_PROJECT_MESSAGE(".//*[@id='requestFormModal']/div/div/div[2]/form/div[5]/textarea"),
    START_PROJECT_SEND_BUTTON(".//*[@id='requestFormModal']/div/div/div[2]/form/div[6]/input"),
    START_PROJECT_CLOSE(".//*[@id='requestFormModal']/div/div/div[1]/button"),
    //Contact Us Now form
    NAME_INPUT(".//*[@id='contact-form']/div/input[1]"),
    EMAIL_INPUT(".//*[@id='contact-form']/div/input[2]"),
    PHONE_INPUT(".//*[@id='contact-form']/div/input[3]"),
    MESSAGE_TEXTFIELD(".//*[@id='contact-form']/div/textarea"),
    SENT_BUTTON(".//*[@id='contact-form']/div/div[2]/button"),
    //Blog
    //ALL_TAB("html/body/div[2]/div/div/ul/li[6]/a"),
    ARTICLE_LINK("html/body/div[3]/div[1]/div[2]/div[5]/div[3]/a[2]"),
    SHARE_FACEBOOK("html/body/div[6]/div[1]/ul/li[1]"),
    SHARE_TWEET("html/body/div[6]/div[1]/ul/li[2]"),
    SHARE_LINKED_IN("html/body/div[6]/div[1]/ul/li[3]"),
    SHARE_GOOGLE("html/body/div[6]/div[1]/ul/li[4]"),
    SHARE_EMAIL("html/body/div[6]/div[1]/ul/li[5]"),
    CANCEL_FACEBOOK(".//*[@id='u_0_3']");
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
