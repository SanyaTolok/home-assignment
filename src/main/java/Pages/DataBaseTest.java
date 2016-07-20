package Pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTest
{
    private static String userName; private static String password; private static String dbURL; private static Connection connection; public static void main(String[] args)
{
    try
{ userName = "username"; password = "password"; dbURL = "jdbc:mysql://artoftesting.com/testDB"; try {
    Class.forName("com.mysql.jdbc.Driver"); } catch (ClassNotFoundException e) { System.out.println("MySQL JDBC driver not found."); e.printStackTrace();
} try
{
    connection = DriverManager.getConnection(dbURL, userName, password);
    Statement st = connection.createStatement();
    String sqlStr = "select * from testTable";
    ResultSet rs = st.executeQuery(sqlStr); while (rs.next()) { System.out.println(rs.getString("name"));
}
}
catch (SQLException e) { System.out.println("Connection to MySQL db failed");
    e.printStackTrace();
}
}
    catch (Exception e) { e.printStackTrace(); } } }
