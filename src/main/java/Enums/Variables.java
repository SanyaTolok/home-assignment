package Enums;

public enum Variables
{
    //HomePage xPath
    CLOSE_POPUP_BUTTON("//button[@aria-label=\"Close guide\"]"),
    POPUP_VIEW("//*[@id=\"userflow-ui\"]/div[1]/div[1]/div[1]/div[1]/iframe"),
    SEARCH_ATTRIBUTE_BOX("//input[@data-role=\"search-input\"]");
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
