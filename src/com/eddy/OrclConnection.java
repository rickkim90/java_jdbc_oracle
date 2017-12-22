package com.eddy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrclConnection {
	private static Connection orclConn;
	private OrclConnection() {
		
	}
public static Connection getConnection() throws ClassNotFoundException, SQLException {
	if (orclConn == null) {
		String url = "jdbc:oracle:thin:@70.12.50.50:1521:XE";
		String user = "dream20";
		String pass = "catcher";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		orclConn = DriverManager.getConnection(url, user, pass);		
	}
	return orclConn;
}
public static void close() throws SQLException {
	if(orclConn != null) {
		if(orclConn.isClosed()) {
			orclConn.close();
		}
	}
}
}
