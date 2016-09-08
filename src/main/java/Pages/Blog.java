package Pages;

import Elements.Button;
import Elements.Element;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
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
    private static Button tab_all=new Button(By.xpath(Variables.ALL_TAB.toString()));
    private static Button tab_cloud=new Button(By.xpath(Variables.CLOUD_TECHNOLOGY_TAB.toString()));
    private static Button tab_company_news=new Button(By.xpath(Variables.COMPANY_NEWS_TAB.toString()));
    private static Button tab_it_news=new Button(By.xpath(Variables.IT_NEWS_TAB.toString()));
    private static Button tab_marketing=new Button(By.xpath(Variables.MARKETING_TAB.toString()));
    private static Button tab_case=new Button(By.xpath(Variables.CASE_TAB.toString()));
    private static Button tab_programming=new Button(By.xpath(Variables.PROGRAMMING_TAB.toString()));
    private static Button post=new Button(By.xpath(Variables.POST_COMMENT_BUTTON.toString()));
    private static Button cancel_google=new Button(By.xpath(Variables.CANCEL_GOOGLE_BUTTON.toString()));
    public static Blog all_tabs_exsist()
    {
        blog_link.click();
        tab_case.isPresent();
        tab_case.click();
        tab_cloud.isPresent();
        tab_cloud.click();
        tab_all.isPresent();
        tab_all.click();
        tab_company_news.isPresent();
        tab_company_news.click();
        tab_it_news.isPresent();
        tab_it_news.click();
        tab_marketing.isPresent();
        tab_marketing.click();
        tab_programming.isPresent();
        tab_programming.click();
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
    public static Blog share_google()
    {
        blog_link.click();
        article.waitForElementIsPresent();
        article.click();
        share_google.waitForElementIsPresent();
        share_google.click();
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
        if(url.contains("https://plus.google.com/share?"))
        {
           driver.close();
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
        Settings.waitInSeconds(15);
        close_subscription_popup.click();
        driver.switchTo().frame("dsq-app1");
        Settings.waitInSeconds(1);
        activate.click();
        start_discuss.waitForElementIsPresent();
        start_discuss.isClickable();
        Settings.waitInSeconds(2);
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
        Settings.waitInSeconds(2);
        email.enterText("jasonbrienflocktoo@gmail.com");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        pass.enterText("ddi-dev.tests"+ dateFormat.format(cal.getTime()));
        login_button.click();
        driver.switchTo().window(parentWindowHandler);
        driver.switchTo().frame("dsq-app2");
        start_discuss.waitForElementIsPresent();
        start_discuss.enterText("simple comment ddi-dev.test");
        post.click();
        String text = "simple comment ddi-dev.test";
        Element posts = new Element(By.linkText(text));
        String id = String.valueOf(posts.getAttribute("id"));
        System.out.print(id);
        Settings.waitInSeconds(4);
        WebElement dropdown = driver.findElement(By.xpath(".//*[@id='"+ id +"']/div[2]/ul/li[3]/a".toString()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        Button delete=new Button(By.xpath(Variables.DELETE.toString()));
        delete.click();
        driver.switchTo().alert().accept();
        return new Blog();
    }
  }
