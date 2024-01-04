import java.sql.*;
import java.sql.DriverManager;

public class JdbcExample {
    public static void main(String[] args) {

        String url="jdbc:mysql:// localhost:3306/java_db";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();


            ResultSet resultset=statement.executeQuery("select * from javatable");
      while(resultset.next()) {
          System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getInt(3));


      }
      connection.close();
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}