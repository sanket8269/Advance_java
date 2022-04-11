package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Bean.AuthenticateBean;

public class AuthenticateModel {
	public AuthenticateBean Authenticate(String email, String pwd) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERTABLE WHERE EMAIL= ? AND PASSWORD = ?");

		ps.setString(1, email);
		ps.setString(2, pwd);

		ResultSet rs = ps.executeQuery();

		AuthenticateBean bean = null;

		while (rs.next()) {
			bean = new AuthenticateBean();
			bean.setFirst_name(rs.getString(2));
			bean.setEmail(rs.getString(3));
			bean.setPwd(rs.getString(6));

		}
		return bean;

	}

	public AuthenticateBean Authenticate(String email) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERTABLE WHERE EMAIL= ?");

		ps.setString(1, email);

		ResultSet rs = ps.executeQuery();

		AuthenticateBean bean = null;

		while (rs.next()) {
			bean = new AuthenticateBean();
			bean.setEmail(rs.getString(3));

		}
		return bean;

	}

	public AuthenticateBean Authenticate1(String pwd) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERTABLE SET PASSWORD= ? ");

		ps.setString(1, pwd);

		ResultSet rs = ps.executeQuery();

		AuthenticateBean bean = null;

		while (rs.next()) {
			bean = new AuthenticateBean();
			bean.setEmail(rs.getString(6));

		}
		return bean;

	}

}
