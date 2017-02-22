package Pages;
import java.sql.Connection;
import java.sql.DriverManager;

   public class DataBaseTest {
        private static final String url = "jdbc:mysql:databaseadr";
        private static final String user = "";
        private static final String password = "";

        public static void connectDataBase() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                Connection con = DriverManager.getConnection(url,user ,password );
            }
            catch (Exception e){
                e.printStackTrace();
            }}}