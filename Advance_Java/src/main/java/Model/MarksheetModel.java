package Model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import Bean.MarksheetBean;
import Bean.StudentBean;

import java.sql.Connection;

public class MarksheetModel {

	public static void testadd(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("INSERT INTO MARKSHEET VALUES(?,?,?,?,?,?,?)");

		ps.setInt(1, NextPk());
		ps.setString(2, bean.getRoll_NO());
		ps.setString(3, bean.getFIRST_NAME());
		ps.setString(4, bean.getLAST_NAME());
		ps.setString(5, bean.getCHEMISTRY());
		ps.setString(6, bean.getPHYSICS());
		ps.setString(7, bean.getMATHS());

		int i = ps.executeUpdate();
		conn.commit();

		System.out.println("inserted");

		ps.close();
		conn.close();
	}

	public static int NextPk() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);

		int pk = 0;

		java.sql.PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM MARKSHEET");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}

		conn.commit();

		conn.close();
		return pk + 1;
	}

	public List<MarksheetBean> search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement(
				"SELECT ID, ROLL_NO, FIRST_NAME, LAST_NAME, PHYSICS, CHEMISTRY, MATHS FROM MARKSHEET");
		ResultSet rs = ps.executeQuery();

		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();

		while (rs.next()) {

			MarksheetBean bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRoll_NO(rs.getString(2));
			bean.setFIRST_NAME(rs.getString(3));
			bean.setLAST_NAME(rs.getString(4));
			bean.setPHYSICS(rs.getString(5));
			bean.setCHEMISTRY(rs.getString(6));
			bean.setMATHS(rs.getString(7));

			list.add(bean);
		}

		conn.commit();
		ps.close();
		conn.close();
		return list;

	}


	public static void testupdate(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "root");

		PreparedStatement ps = conn
				.prepareStatement("UPDATE MARKSHEET SET ROLL_NO, FIRST_NAME, LAST_NAME, PHYSICS, CHEMISTRY, MATHS WHERE ID = ?");
		ps.setString(1, bean.getFIRST_NAME());
		ps.setString(2, bean.getLAST_NAME());
		ps.setString(3, bean.getRoll_NO());
		ps.setString(4, bean.getPHYSICS());
		ps.setString(4, bean.getCHEMISTRY());
		ps.setString(4, bean.getMATHS());
		ps.setInt(4, bean.getId());
		int i = ps.executeUpdate();

		System.out.println("UPDATED");
		ps.close();

		conn.close();
	}

	public static void testdelete(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket", "root", "root");

		java.sql.PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET WHERE ID = ?");

		ps.setInt(1, bean.getId());

		int i = ps.executeUpdate();

		System.out.println("DELETED");

		conn.close();
		ps.close();

}
	public List<MarksheetBean> testMeritlist() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		 java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/sanket","root","root");
		 
		 conn.setAutoCommit(false);
		
		 PreparedStatement ps =conn.prepareStatement("SELECT ID,ROLL_NO,FIRST_NAME,LAST_NAME,PHYSICS,CHEMISTRY,MATHS,(PHYSICS + CHEMISTRY + MATHS) AS TOTAL , (PHYSICS + CHEMISTRY + MATHS)/3 AS PERCENTAGE FROM MARKSHEET WHERE (PHYSICS > 40 AND CHEMISTRY > 40 AND MATHS > 40) ORDER BY TOTAL DESC LIMIT 5");
		ResultSet i = ps.executeQuery();
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		while (i.next()) {
			MarksheetBean bean = new MarksheetBean();
			bean.setId(i.getInt(1));
			bean.setRoll_NO(i.getString(2));
			bean.setFIRST_NAME(i.getString(3));
			bean.setLAST_NAME(i.getString(4));
			bean.setPHYSICS(i.getString(5));
			bean.setCHEMISTRY(i.getString(6));
			bean.setMATHS(i.getString(7));

			list.add(bean);

		}
		conn.commit();
		conn.close();
		return list;

}
}