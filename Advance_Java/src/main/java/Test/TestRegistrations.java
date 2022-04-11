package Test;

import java.sql.DriverManager;
import java.sql.ResultSet;

import Bean.RegistrationBean;
import Model.RegistrationModel;

public class TestRegistrations {
	public static void main(String[] args) throws Exception {
		 testadd();
		// testdelete();
	}


	/*
	 * private static void testdelete() throws Exception { RegistrationBean bean =
	 * new RegistrationBean(); bean.setID(10);
	 * 
	 * RegistrationModel rm = new RegistrationModel(); rm.testdelete(bean); }
	 * 
	 */
	private static void testadd() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		bean.setNAME("RAHESH");
		bean.setEmail("RAHESH153@gmail.com");
		bean.setCONTACT("212222");
		bean.setCITY("indore");
		bean.setPASSWORD("222222");

		RegistrationModel rm = new RegistrationModel();
		rm.testadd(bean);
		System.out.println("INTSERTED");

	}
}
