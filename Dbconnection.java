package mulesoft;
import java.sql.*;
public class Dbconnection {
public static Connection connect() {
	Connection con=null; 
	try {
		Class.forName("org.sqlite.JDBC");
		DriverManager.getConnection("jdbc:sqlite:C:\Users\SathishKumar\Desktop\Mulesoftroshan.db");
		//System.out.println("Connected"); I have used this check whether this db is connected.
		con=DriverManager.getConnection("jdbc:sqlite:C:\Users\SathishKumar\Desktop\Mulesoftroshan.db"); 
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		//System.out.println(e+"");
	}
	return con;
}
}
