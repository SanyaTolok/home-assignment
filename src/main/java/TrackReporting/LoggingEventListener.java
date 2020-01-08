package TrackReporting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class LoggingEventListener implements WebDriverEventListener {
    private Log log = LogFactory.getLog(this.getClass());
    private By lastFindBy;

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        log.info("Navigating to:'" + url + "'");
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        lastFindBy = by;
    }

    @Override
    public void onException(Throwable error, WebDriver driver) {
        if (error.getClass().equals(NoSuchElementException.class)) {
            log.error("WebDriver error: Element not found " + lastFindBy);
        } else if (error.getClass().equals(StaleElementReferenceException.class)) {
            log.error("WebDriver error: StaleElementReferenceException occurred while finding " + lastFindBy);
        } else {
            log.error("WebDriver error:", error);
        }
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        log.info("- - Ok! Element, found " + lastFindBy + " clicked successfully");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        log.info("Successfully found: '" + lastFindBy + "'");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        log.info("Opened page from history: '" + driver.getCurrentUrl() + "'");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        log.info("Opened page from history: '" + driver.getCurrentUrl() + "'");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        log.info("Successfully refreshed page");
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        log.info("Successfully navigated to  "+ url);
    }

    @Override
    public void afterScript(String url, WebDriver driver) {
    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        log.info("Switching to "+ windowName);
    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        log.info("Switched to "+ windowName);
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        log.info("Clicking on " + lastFindBy);
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        log.info("Navigating back");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        log.info("Navigating forward");
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        log.info("Executing script: '" + script + "' with element, found " + lastFindBy);
    }
}
