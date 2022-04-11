package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Bean.RegistrationBean;
import Bean.StudentBean;

public class StudentModel {

	public static void testadd(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?)");

		ps.setInt(1, NextPk());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getFirstName());
		ps.setString(4, bean.getLastName());
		ps.setString(5, bean.getSession());

		int i = ps.executeUpdate();

		ps.close();

		conn.close();

	}

	public static int NextPk() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);

		int pk = 0;

		java.sql.PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM STUDENT");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}

		conn.commit();

		conn.close();
		return pk + 1;
	}

	public static void testupdate(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn
				.prepareStatement("UPDATE STUDENT SET FIRST_NAME = ?, LAST_NAME = ? , SESSION = ? WHERE ROLL_NO = ?");
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());

		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNo());
		int i = ps.executeUpdate();

		System.out.println("UPDATED");
		ps.close();

		conn.close();
	}

	public static void testdelete(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		java.sql.PreparedStatement ps = conn.prepareStatement("DELETE FROM STUDENT WHERE ROLL_NO = ?");

		ps.setString(1, bean.getRollNo());

		int i = ps.executeUpdate();

		System.out.println("DELETED");

		conn.close();
		ps.close();
	}

	public static List<StudentBean> testsearch() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Select ROLL_NO , FIRST_NAME, LAST_NAME, SESSION FROM STUDENT");
		ResultSet i = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (i.next()) {
			StudentBean MB = new StudentBean();
			MB.setRollNo(i.getString(2));
			MB.setFirstName(i.getString(3));
			MB.setLastName(i.getString(4));

			list.add(MB);

		}
		conn.commit();
		ps.close();
		conn.close();
		return list;

	}

	public static List<StudentBean> get(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM STUDENT WHERE ROLL_NO= ?");
		ps.setString(1, bean.getRollNo());
		ResultSet i = ps.executeQuery();

		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (i.next()) {
			StudentBean bean1 = new StudentBean();
			bean1.setId(i.getString(1));
			bean1.setRollNo(i.getString(2));
			bean1.setFirstName(i.getString(3));
			bean1.setLastName(i.getString(4));
			bean1.setSession(i.getString(5));
			list.add(bean1);

		}
		conn.close();
		return list;

	}

}
