package edu.product.dao;
import  java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.product.dbase.DatabaseConnection;
import edu.product.model.Product;
public class ProductDao {
	public static int saveProduct(Product prod) throws ClassNotFoundException, SQLException{
		int result = 0;
		String insertStatement = "INSERT INTO product(pname,bname,pquan,pdesc,price) VALUES(?,?,?,?,?)";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(insertStatement);
			pst.setString(1, prod.getPname());
			pst.setString(2, prod.getBname());
			pst.setString(3, prod.getPquan());
			pst.setString(4, prod.getPdesc());
			pst.setInt(5, prod.getPrice());
			
			result = pst.executeUpdate();

		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		return result;
	}
	public static int updateProduct(Product prod) throws ClassNotFoundException, SQLException{
		int result = 0;
		String insertStatement = "Updata product set pname=?, bname=?, pquan=?, price=? where pdesc=?";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(insertStatement);
			pst.setString(1, prod.getPname());
			pst.setString(2, prod.getBname());
			pst.setString(3, prod.getPquan());
			pst.setString(4, prod.getPdesc());
			pst.setInt(5, prod.getPrice());
			result = pst.executeUpdate();

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static List <Product> getProduct() throws ClassNotFoundException, SQLException{
		List<Product> prod = new ArrayList<>();
		String getStatement = "SELECT * FROM product";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(getStatement);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String pname = rs.getString("pname");
				String bname = rs.getString("bname");
				String pquan = rs.getString("pquan");
				String pdesc = rs.getString("pdesc");
				int price = rs.getInt("price");
			prod.add(new Product(id,pname,bname,pquan,pdesc,price));
					
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return prod;
	}
	public static int deleteProductById(int id) throws ClassNotFoundException, SQLException{
		int del_status = 0;
		String getStatement = "DELETE FROM product WHERE id = "+id;
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
