package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Jdbc {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/employees_database";
		try {
			Connection con=DriverManager.getConnection(url,"root","Mainhibtarha30@");
			//established connection object
			
			Statement st=con.createStatement();  // a statement object to write an SQL statement
			
//			ResultSet rs= st.executeQuery("Select * from employees_tbl");
//			the same query that we wrote in sql work bench
			//Result set object will story the result of the query
			
//			while(rs.next())
//			{
//				System.out.println(rs.getString("name"));
//				
//				//print the name from the data
//				
//			}
//			System.out.println(rs.getMetaData());
//			System.out.println(rs.getMetaData().getColumnCount());
//			int affected=st.executeUpdate("insert into employees_tbl(id,name,dept,salary) values(8,'Huego','Technology',5500)");
//			System.out.println("Insert Done! " +affected);
			
//			int a2=st.executeUpdate("Delete from employees_tbl where id=8");
			
			
			ResultSet rs= st.executeQuery("Select * from employees_tbl");
			while(rs.next())
			{
				System.out.println(rs.getString("id")+" "+rs.getString("name")+" " + rs.getString("dept")+" "+rs.getString("salary"));
				
				//print the name from the data
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
