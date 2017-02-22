package Pages;

import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;

public class Blog extends Settings {
    private static Button blog_link= new Button(By.xpath(Variables.BLOG_LINK.toString()));
    private static Button share_facebook= new Button(By.xpath(Variables.SHARE_FACEBOOK.toString()));
       private static Button article= new Button(By.xpath(Variables.ARTICLE_LINK.toString()));
    private static Button share_tweet= new Button(By.xpath(Variables.SHARE_TWEET.toString()));
    private static Button share_linkedin= new Button(By.xpath(Variables.SHARE_LINKED_IN.toString()));
    private static Button share_google= new Button(By.xpath(Variables.SHARE_GOOGLE.toString()));
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
        waitInSeconds(2);
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
                              driver.close();
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
        waitInSeconds(4);
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
        Settings.waitInSeconds(3);
        driver.switchTo().frame("dsq-app1");
        Settings.waitInSeconds(1);
        activate.click();
        start_discuss.waitForElementIsPresent();
        start_discuss.isClickable();
        Settings.waitInSeconds(2);
        disqus_login.click();
        waitInSeconds(5);
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
        email.isClickable();
        email.enterText("jasonbrienflocktoo@gmail.com");
        pass.isClickable();
        pass.enterText("ddi-dev.tests");
        login_button.click();
        driver.switchTo().window(parentWindowHandler);
        driver.switchTo().frame("dsq-app1");
        start_discuss.waitForElementIsPresent();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        start_discuss.enterText("simple comment ddi-dev.test"+ dateFormat.format(cal.getTime()));
        post.click();
        waitInSeconds(4);
        WebElement dropdown = driver.findElement(By.xpath(".//*[contains(@id,'post')]/div[2]/ul/li[3]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).click().build().perform();
        WebElement delete = driver.findElement(By.xpath(".//*[contains(@id,'post')]/div[2]/ul/li[3]/ul/li[1]/a"));
        delete.click();
        waitInSeconds(3);
        driver.switchTo().alert().accept();
        waitInSeconds(3);
        return new Blog();
    }
  }
