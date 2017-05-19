import Pages.DataBaseTest;
import org.testng.annotations.Test;

public class TestsDataBase {
    @Test(priority = 1)
    public void connect_with_data_base() {
        DataBaseTest.connectDataBase();}
}
