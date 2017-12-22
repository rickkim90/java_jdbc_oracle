package com.eddy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String sql = "INSERT INTO NAMECARD VALUES " +
		      "(SEQ_NAMECARD_NO.NEXTVAL," +
			  "'È«±æµ¿',"+
		      "'011-0000-0000'," +
			  "'hongkildong@gmail.org',"+
		      "'È°ºó´ç')";
		try{
			con = OrclConnection.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(sql);
		}finally{
			try{
				stmt.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
			try{
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}

}