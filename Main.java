package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("  VIKRAM ","  Kamal        " ,"Fahad               ",2022,"Lokesh Kanagaraj");
	insert("  PUSPHA  ","Fahad Fasil   ","Samantha            ",2022,"Sukumar");
	insert("ENDHIRAN "," Rajinikhanth  ","Iswarya             ",2010,"Vineeth Sr");
	insert("  N G K  ","     SURYA     ","  Sai Palavi        ",2019,"Selvaragavan");
	insert("    83   ","Ranveer Singh   ","Deepika Padukone    ",2021,"Kabir Khan");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
