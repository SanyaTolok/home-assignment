package Pages;
import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Blog extends Settings {
    private static Button blog_link= new Button(By.xpath(Variables.BLOG_LINK.toString()));
    private static Button share_facebook= new Button(By.xpath(Variables.SHARE_FACEBOOK.toString()));
    private static Button cancel_facebook= new Button(By.xpath(Variables.CANCEL_FACEBOOK.toString()));
    private static Button article= new Button(By.xpath(Variables.ARTICLE_LINK.toString()));
    private static Button share_tweet= new Button(By.xpath(Variables.SHARE_TWEET.toString()));
    private static Button share_linkedin= new Button(By.xpath(Variables.SHARE_LINKED_IN.toString()));
    private static Button share_google= new Button(By.xpath(Variables.SHARE_GOOGLE.toString()));
    private static Button share_email= new Button(By.xpath(Variables.SHARE_EMAIL.toString()));
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    private static Button next_page=new Button(By.xpath(Variables.NEXT_PAGE.toString()));
    private static Button second_page=new Button(By.xpath(Variables.SECOND_PAGE.toString()));
    private static Button previous=new Button(By.xpath(Variables.PREVIOUS_PAGE.toString()));
    private static TextField start_discuss=new TextField(By.xpath(Variables.START_DISCUSS.toString()));
    private static Button activate=new Button(By.xpath(Variables.ACTIVATE_START_DISCUSS.toString()));
    private static Button disqus_login=new Button(By.xpath(Variables.DISQUS_LOGIN.toString()));
    private static TextField email=new TextField(By.xpath(Variables.DISQUS_EMAIL.toString()));
    private static TextField pass=new TextField(By.xpath(Variables.DISQUS_PASS.toString()));
    private static Button login_button=new Button(By.xpath(Variables.LOGIN_DISQUS.toString()));
    private static Button post=new Button(By.xpath(Variables.POST_COMMENT_BUTTON.toString()));
    public static Blog all_tabs_exsist()
    {
        blog_link.click();
        Settings.waitInSeconds(12);
        close_subscription_popup.click();
        return new Blog();
    }
    public static Blog share_facebook()
    {
        blog_link.click();
        article.waitForElementIsPresent();
        article.click();
        share_facebook.waitForElementIsPresent();
        share_facebook.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
       while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url = driver.getCurrentUrl();// get popup url
              if(url.contains("https://www.facebook.com/login.php"))
              {
                              cancel_facebook.click();
              }
        else
        {
            Assert.fail("Test failed");
        }

        driver.switchTo().window(parentWindowHandler);  // switch back to parent window
        return new Blog();
    }
    public static Blog share_tweet()
    {
        blog_link.click();
        article.waitForElementIsPresent();
        article.click();
        share_tweet.waitForElementIsPresent();
        share_tweet.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_tweet = driver.getCurrentUrl();
               if(url_tweet.contains("https://twitter.com")) {
                        driver.close();
        }
        else
        {
            Assert.fail("Test failed");
        }
        driver.switchTo().window(parentWindowHandler);
        return new Blog();
    }
    public static Blog share_linked_in()
    {
        blog_link.click();
        article.waitForElementIsPresent();
        article.click();
        share_linkedin.waitForElementIsPresent();
        share_linkedin.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_linkedin = driver.getCurrentUrl();
        if(url_linkedin.contains("https://www.linkedin.com/uas/login")) {
            driver.close();
        }
        else
        {
            Assert.fail("Test failed");//show error message if link is incorrect

        }
        driver.switchTo().window(parentWindowHandler);
        return new Blog();
    }
    public static Blog test_paging()
    {
        blog_link.click();
        second_page.click();
        next_page.click();
        previous.click();
        return new Blog();
    }
    public static Blog discuss_add_comment()
    {
        blog_link.click();
        article.waitForElementIsPresent();
        article.click();
        Settings.waitInSeconds(14);
        close_subscription_popup.click();
        driver.switchTo().frame("dsq-app2");
        activate.click();
        start_discuss.waitForElementIsPresent();
        start_discuss.enterText("simple comment ddi-dev.test");
        disqus_login.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        email.enterText("jasonbrienflocktoo@gmail.com");
        pass.enterText("ddi-dev.tests");
        login_button.click();
        driver.switchTo().window(parentWindowHandler);
        driver.switchTo().frame("dsq-app2");
        start_discuss.waitForElementIsPresent();
        start_discuss.enterText("simple comment ddi-dev.test");
        post.click();
        return new Blog();
    }
    public static Blog remove_comment() {
        blog_link.click();
        article.waitForElementIsPresent();
        article.click();
        Settings.waitInSeconds(14);
        close_subscription_popup.click();
        driver.switchTo().frame("dsq-app2");
        activate.click();
        start_discuss.waitForElementIsPresent();
        start_discuss.enterText("simple comment ddi-dev.test");
        disqus_login.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        email.enterText("jasonbrienflocktoo@gmail.com");
        pass.enterText("ddi-dev.tests");
        login_button.click();
        driver.switchTo().window(parentWindowHandler);
        driver.switchTo().frame("dsq-app2");
        List<WebElement> posts = getDriver().findElements(By.xpath(Variables.LIST_OF_POSTS.toString()));
            if (posts.contains("simple comment ddi-dev.test"))
            {
                Button dropdown=new Button(By.xpath(Variables.DROPDOWN.toString()));
                dropdown.click();
                Button delete=new Button(By.xpath(Variables.DELETE.toString()));
                delete.click();
                driver.switchTo().alert().accept();
            }
        else
            {
                Assert.fail("post not removed");
            }
        return new Blog();
    }
}
