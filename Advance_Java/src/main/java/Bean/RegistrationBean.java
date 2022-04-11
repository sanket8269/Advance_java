package Bean;

public class RegistrationBean {

	private String ID;
	private String NAME;
	private String EMAIL;
	private String CONTACT;
	private String CITY;
	private String PASSWORD;

	public String getID() {
		return ID;
	}

	public void setID(String i) {
		ID = i;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getEmail() {
		return EMAIL;
	}

	public void setEmail(String email) {
		EMAIL = email;
	}

	public String getCONTACT() {
		return CONTACT;
	}

	public void setCONTACT(String cONTACT) {
		CONTACT = cONTACT;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

}
