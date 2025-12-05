// import MainSettings.Settings;
// import Pages.*;
// import java.net.MalformedURLException;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.Optional;
// import org.testng.annotations.Parameters;
// import org.testng.annotations.Test;

// public class LoginTest extends Settings {

//     @BeforeClass
//     @Parameters({"browser", "testName"})
//     public void FileReadBrowserLaunch(@Optional("Chrome") String browser, @Optional("Attributes test cases") String testName) throws MalformedURLException {
//         launchBrowser(browser, testName);
//     }

//     @Test(priority = 1, groups = "smoke")
//     public void login_test() {
//         Login.login();
//         Login.logOut();
//     }

//     @Test(priority = 1, groups = "smoke")
//     public void home_page_test() {
//         Login.login();
//         HomePage.assertHomePage();
//         Login.logOut();
//     }


//     @AfterClass
//     public void TerminateTestCase() {
//         driver.quit();
//     }
// }
