import Pages.DataBaseTest;
import org.testng.annotations.Test;

public class TestsDataBase {
    @Test(priority = 1, groups = "smoke")
    public void connect_with_data_base() {
        DataBaseTest.connectDataBase();}
}
