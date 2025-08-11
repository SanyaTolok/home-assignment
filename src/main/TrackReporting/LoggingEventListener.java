package TrackReporting;

import MainSettings.DriverHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class LoggingEventListener implements ITestListener {

    Logger log;
    String testName;
    String testMethodName;

    @Override
    public void onTestStart(ITestResult result) {
        this.testMethodName = result.getMethod().getMethodName();
        log.info("[>>>>>>>>>>>>>>> Starting]", testMethodName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            DriverHelper.takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("[+++++++++++++++ Test passed]", testMethodName);
        DriverHelper.markTestPassed();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            DriverHelper.takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.error("[--------------- Test failed]", testMethodName);
        DriverHelper.markTestFailed();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
        this.testName = context.getCurrentXmlTest().getName();
        this.log = LogManager.getLogger(testName);
        log.info("[=================== TEST " + testName + " STARTED]");
    }

    @Override
    public void onFinish(ITestContext context) {
        log.info("=================== [ALL " + testName + " FINISHED]");
    }

}