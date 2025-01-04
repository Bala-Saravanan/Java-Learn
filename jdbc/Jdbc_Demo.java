package jdbc;

import java.sql.*;

public class Jdbc_Demo {

	public static void main(String[] args) {
		
		// BASIC CRUD OPERATIONS USING JDBC;
		
		// CREATE
		insertData();
		insertVar();
		insertPst();
		
		// READ
		readRecords();
		
		// UPDATE
		updateData(3);

		// DELETE
		deleteData(7);

	}
	
	// method to read data from database;
	public static void readRecords() {
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user_name = "root";
		String password = "Jbala$007";
		
		String query = "select * from students";
		
		try {
			Connection con = DriverManager.getConnection(url, user_name, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("GPA: " + rs.getBigDecimal(3));
				System.out.println("--------------------");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//method to insert hard coded data into database;
	public static void insertData() {
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user_name = "root";
		String password = "Jbala$007";
		
		String query = "insert into students values(5, 'Surya', 8.7);";
		
		try {
			Connection con = DriverManager.getConnection(url, user_name, password);
			Statement st = con.createStatement();
			int row = st.executeUpdate(query);
			
			System.out.println("No. of Rows affected: " + row);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// method to insert data into database using variables;
	
	public static void insertVar() {
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user_name = "root";
		String password = "Jbala$007";
		
		int id = 6;
		String name = "Ranjith";
		float gpa = 9.3f;
		
		String query = "insert into students values (" + id + ",'" + name + "'," + gpa + ");";
	
		try {
			Connection con = DriverManager.getConnection(url, user_name, password);
			Statement st = con.createStatement();
			int row = st.executeUpdate(query);
			
			System.out.println("No. of Rows affected: " + row);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// method to insert data into database using prepared statement;
	public static void insertPst() {
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user_name = "root";
		String password = "Jbala$007";
		
		int id = 7;
		String name = "Varun";
		float gpa = 9.4f;
		
		String query = "insert into students values (?, ?, ?);";
		
		try {
			Connection con = DriverManager.getConnection(url, user_name, password);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, gpa);
			int rows = pst.executeUpdate();
			
			System.out.println("No. of Rows affected: " + rows);
			
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// method to delete a data using its id;
	public static void deleteData(int id) {
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user_name = "root";
		String password = "Jbala$007";
		
		String query = "delete from students where id = ?;";
		
		try {
			Connection con = DriverManager.getConnection(url, user_name, password);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			int row = pst.executeUpdate();
			
			System.out.println("No. of Rows affected: " + row);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// method to update a data using its id;
	public static void updateData(int id) {
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user_name = "root";
		String password = "Jbala$007";
		
		String query = "update students set gpa = 9.1 where id = ?;";
		
		try {
			Connection con = DriverManager.getConnection(url, user_name, password);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			int row = pst.executeUpdate();
			
			System.out.println("No. of Rows affected: " + row);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
