package Enums;

public enum Variables
{
    //HomePage xPath
    PREVIOUS_PAGE(""),
    NEXT_PAGE(""),
    SECOND_PAGE("");
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
