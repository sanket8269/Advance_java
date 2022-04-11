package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Bean.RegistrationBean;

public class RegistrationModel {

	public void testadd(RegistrationBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn.prepareStatement("INSERT INTO USERTABLE VALUES(?,?,?,?,?,?)");

		ps.setInt(1, NextPk());
		ps.setString(2, bean.getNAME());
		ps.setString(3, bean.getEmail());
		ps.setString(4, bean.getCONTACT());
		ps.setString(5, bean.getCITY());
		ps.setString(6, bean.getPASSWORD());

		int i = ps.executeUpdate();

		ps.close();
		conn.close();

	}

	public static int NextPk() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);

		int pk = 0;

		java.sql.PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM USERTABLE");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}

		conn.commit();

		conn.close();
		return pk + 1;
	}

}		
