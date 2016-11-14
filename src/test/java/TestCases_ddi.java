import MainSettings.Settings;
import Pages.*;
import org.testng.annotations.Test;

public class TestCases_ddi extends Settings
{
    @Test(priority = 1, groups = "smoke")
    public void verify_links_management_CEO() {Management.verify_links_CEO();}
    @Test(priority = 1, groups = "smoke")
    public void verify_links_bdm_Europa(){Management.verify_links_bdm_Europa();}
    @Test(priority = 1, groups = "smoke")
    public void verify_links_head_marketing(){Management.verify_links_head_marketing_department();}
    @Test(priority = 1, groups = "smoke")
    public void verify_links_pr_manager(){Management.verify_links_pr_manager();}
    @Test(priority = 1, groups = "smoke")
    public void zoom_map_contact_us() {Contact_US.zoom_in_and_zoom_out_map();    }
    @Test(priority = 1, groups = "smoke")
    public void company_links_verify_present(){Company.company_links_present();}
    @Test(priority = 1, groups = "smoke")
    public void change_tabs_how_we_work(){How_We_Work.change_tabs();}
    @Test(priority = 1, groups = "smoke")
    public void hww_links_verify_present(){How_We_Work.how_we_work_present();}
    @Test(priority = 1, groups = "smoke")
    public void how_we_work_links_verify_present(){}
    @Test(priority = 1, groups = "smoke")
    public void test_paging_blog() {Blog.test_paging(); }
    @Test(priority = 1, groups = "smoke")
    public void portfolio_tabs_exist_and_works() { Portfolio.tabs_exist_and_works();    }
    @Test(priority = 1, groups = "smoke")
    public void send_request() {   HomePage.send_request();    }
    @Test(priority = 1, groups = "smoke")
    public void verify_subscription() {HomePage.subscribe_email();}
    @Test(priority = 1, groups = "smoke")
    public void test_blog_tabs() {  Blog.all_tabs_exsist();}
    @Test(priority = 1, groups = "smoke")
    public void share_blog_facebook() {Blog.share_facebook();}
    @Test(priority = 1, groups = "smoke")
    public void share_blog_google() {Blog.share_google();}
    @Test(priority = 1, groups = "smoke")
    public void share_blog_tweet() { Blog.share_tweet();}
    @Test(priority = 1, groups = "smoke")
    public void share_blog_linked_in()  {Blog.share_linked_in();}
    @Test(priority = 1, groups = "smoke")
    public void send_request_contact_us()  {Contact_US.send_request();}
    @Test(priority = 1, groups = "smoke")
    public void test_services_form() {Services.get_request_from_services_page();}
    @Test(priority = 1, groups = "smoke")
    public void services_link_present() {HomePage.services_link_present();}
    @Test(priority = 1, groups = "smoke")
    public void blog_link_present() {HomePage.blog_link_present();}
    @Test(priority = 1, groups = "smoke")
    public void company_link_present()   { HomePage.company_link_present(); }
    @Test(priority = 1, groups = "smoke")
    public void contact_us_link_present() {HomePage.contuct_us_link_present();    }
    @Test(priority = 1, groups = "smoke")
    public void portfolio_link_present() {HomePage.portfolio_link_present();}
    @Test(priority = 1, groups = "smoke")
    public void technology_link_present() {HomePage.technology_link_present();}
    @Test(priority = 1, groups = "smoke")
    public void add_discuss_comment() {Blog.discuss_add_comment();}
}
