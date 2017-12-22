package com.eddy;

import java.sql.*;

public class OrclTest {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT * From emp";

		try {
			conn = OrclConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(5);
				String sal = rs.getString(6);
				String comm = rs.getString(7);
				String depno = rs.getString(8);
				System.out.println(empno + ":" + ename + ":" + job + ":" + mgr + ":" + hiredate + ":" + sal + ":" + ":"
						+ comm + ":" + depno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {

			}
		}
	}
}
