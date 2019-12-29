import java.sql.*;
public class Jdbcdemo {

    public static void main(String[] args) {
      try
	         {
	             String url = "jdbc:mysql://localhost:3306/";
	  		// we are connecting to the addressBook database we created earlier
	  		String database = "addressBook";
	  		// we login as "root" user with password ""
	  		String userName = "root";
	  		String password = "";
	             //loading the jdbc driver
	              //Class.forName("com.mysql.jdbc.Driver").newInstance();
	             //get a connection to database
	             Connection myConn=DriverManager.getConnection(url + database, userName, password);
	             //create a statement
	             Statement stmt=myConn.createStatement();
	             //execute sql query
	             ResultSet rs=stmt.executeQuery("select * from contact");
	             //process the result
	             while(rs.next())
	             {
	                 System.out.println(rs.getString("firstName")+" = "+rs.getString(1));
	             }
	         }
	         catch(SQLException e)
	         {
	             System.out.println(e);
	         }
	         catch(Exception e)
	         {
	             System.out.println(e);
       }
    }

}