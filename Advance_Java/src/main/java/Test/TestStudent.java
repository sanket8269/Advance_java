package Test;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import Bean.StudentBean;
import Model.StudentModel;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		// testadd();
		// testupdate();
		// testdelete();
		// testsearch();
		testget();
	}

	private static void testget() throws Exception {

		StudentBean bean = new StudentBean();
		bean.setRollNo("1101");
		StudentModel model = new StudentModel();
		model.get(bean);

	}

	private static void testsearch() throws Exception {
		StudentModel model = new StudentModel();
		List l = model.testsearch();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			StudentBean b = (StudentBean) it.next();
			System.out.print("\t" + b.getRollNo());
			System.out.print("\t" + b.getFirstName());
			System.out.print("\t" + b.getLastName());
			System.out.print("\t" + b.getSession());

		}
	}

	private static void testdelete() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("1103");

		StudentModel rm = new StudentModel();
		rm.testdelete(bean);
	}

	private static void testupdate() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setFirstName("SUNNY");
		bean.setLastName("SHARMA");

		StudentModel rm = new StudentModel();
		rm.testupdate(bean);
		System.out.println("UPDATED");

	}

	private static void testadd() throws Exception {
		StudentBean bean = new StudentBean();

		bean.setRollNo("1101");
		bean.setFirstName("Sanket");
		bean.setLastName("jain");
		bean.setSession("session");

		StudentModel rm = new StudentModel();
		rm.testadd(bean);
		System.out.println("INTSERTED");

	}

}
