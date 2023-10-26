package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MysqlCon {
	public static void main(String args[]) throws Exception {
		try {
			// Registering the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_sample", "root", "root");
			// here database_sample is database name, root is username and password

			// Creating statement
			Statement stmt = con.createStatement();
			// Executing queries
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {

				int age = rs.getInt("age");
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				// System.out.println(age);
			}

			// UPDATE
			String strUpdate = "update emp set age = 23 where id = 104";
			System.out.println("The SQL statement is: " + strUpdate + "\n"); // Echo for debugging
			int countUpdated = stmt.executeUpdate(strUpdate);
			System.out.println(countUpdated + " records affected.\n");

			String sqlDelete = "delete from emp where id=123";
			System.out.println("The SQL statement is: " + sqlDelete + "\n");
			int countDeleted = stmt.executeUpdate(sqlDelete);
			System.out.println(countDeleted + " records deleted.\n");

			// INSERT a record
			String sqlInsert = "insert into emp values (121, 'Kumar', 30)";
			System.out.println("The SQL statement is: " + sqlInsert + "\n");
			int countInserted = stmt.executeUpdate(sqlInsert);
			System.out.println(countInserted + " records inserted.\n");

			// INSERT multiple records
			sqlInsert = "insert into emp values (122, 'Aniket', 22),(123, 'Shruti', 24),(124, 'Abi', 21)";
			System.out.println("The SQL statement is: " + sqlInsert + "\n");
			countInserted = stmt.executeUpdate(sqlInsert);
			System.out.println(countInserted + " records inserted.\n");

			// Closing connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}