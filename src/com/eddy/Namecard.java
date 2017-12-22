package com.eddy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Namecard {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			con = OrclConnection.getConnection();
			stmt = con.createStatement();
			sql = "CREATE TABLE NAMECARD ( " + "NO NUMBER CONSTRAINT PK_NAMECARD PRIMARY KEY, "
					+ "NAME  VARCHAR2(20) NOT NULL, " + "MOBILE VARCHAR2(20) NOT NULL, " + "EMAIL  VARCHAR2(40), "
					+ "COMPANY VARCHAR2(60))";
			stmt.executeUpdate(sql);
			sql = "CREATE SEQUENCE SEQ_NAMECARD_NO " +
			      "INCREMENT BY 1 "+
				  "START WITH 1";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

}
