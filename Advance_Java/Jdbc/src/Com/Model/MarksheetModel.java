package Com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Com.Bean.MarksheetBean;

public class MarksheetModel {
	public static void main(String[] args) throws Exception {
		add();
	}

	private static void add() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("\"jDbc:mysql://localhost:3306/sanket\",\"root\",\"root\"");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("Select * from marksheet");
		
		
	}
}
