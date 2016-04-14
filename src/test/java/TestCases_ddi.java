import MainSettings.Settings;
import Pages.*;
import org.testng.annotations.Test;

public class TestCases_ddi extends Settings
{
    @Test(priority = 0)
    public void add_discuss_comment()
    {Blog.discuss_add_comment();}
    @Test(priority = 0)
    public void remove_comment_blog()
    {
        Blog.remove_comment();
    }
    @Test(priority = 0)
    public void test_paging_blog()
    {
        Blog.test_paging();
    }
    @Test(priority = 0)
    public void portfolio_tabs_exsist_and_works()
    {
        Portfolio.tabs_exsist_and_works();
    }
    @Test(priority = 0)
    public void get_more_info_portfolio()
    {
        Portfolio.get_more_info();}
    @Test(priority = 0)
    public void send_request()
    {
        HomePage.send_request();
    }
    @Test(priority = 0)
    public void verify_subscription()
    {HomePage.subscribe_email();}
    @Test(priority = 0)
    public void test_blog_tabs()
    {
        Blog.all_tabs_exsist();
    }
    @Test(priority = 0)
    public void share_blog_facebook()
    {
        Blog.share_facebook();
    }
    @Test(priority = 0)
    public void share_blog_tweet()
    {
        Blog.share_tweet();
    }
    @Test(priority = 0)
    public void share_blog_linked_in()
    {Blog.share_linked_in();}
    @Test(priority = 0)
    public void send_request_contact_us()
    {Contact_US.send_request();}
}
