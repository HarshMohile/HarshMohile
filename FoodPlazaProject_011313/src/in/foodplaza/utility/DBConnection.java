package in.foodplaza.utility;

import java.sql.*;


public class DBConnection {
	
	static Connection conn = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodplaza_011313", "root", "root");
		return conn;
	}

}
