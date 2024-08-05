package edu.students.dao;
import  java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.student.dbase.DatabaseConnection;
import edu.student.model.Student;
public class StudentsDao {
	public static int saveStudent(Student stud) throws ClassNotFoundException, SQLException{
		int result = 0;
		String insertStatement = "INSERT INTO Students(fname,lname,email,mobile,pass) VALUES(?,?,?,?,?)";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(insertStatement);
			pst.setString(1, stud.getFname());
			pst.setString(2, stud.getLname());
			pst.setString(3, stud.getEmail());
			pst.setString(4, stud.getMobile());
			pst.setString(5, stud.getPass());
			
			result = pst.executeUpdate();

		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		return result;
	}
	public static int updateStudent(Student stud) throws ClassNotFoundException, SQLException{
		int result = 0;
		String insertStatement = "Updata Student set fname=?, lname=?, mobile=?, pass=? where email=?";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(insertStatement);
			pst.setString(1, stud.getFname());
			pst.setString(2, stud.getLname());
			pst.setString(3, stud.getMobile());
			pst.setString(4, stud.getPass());
			pst.setString(5, stud.getEmail());
			result = pst.executeUpdate();

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static List <Student> getStudent() throws ClassNotFoundException, SQLException{
		List<Student> studs = new ArrayList<>();
		String getStatement = "SELECT * FROM students";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(getStatement);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				String pass = rs.getString("pass");
				studs.add(new Student(id,fname,lname,email,mobile,pass));
					
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return studs;
	}
	public static int deleteStudentById(int id) throws ClassNotFoundException, SQLException{
		int del_status = 0;
		String getStatement = "DELETE FROM students WHERE id = "+id;
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(getStatement);
			del_status = pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return del_status;
				
	}
	
}
