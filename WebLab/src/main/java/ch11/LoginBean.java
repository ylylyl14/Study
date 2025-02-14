package ch11;

/**
 * 
 */
public class LoginBean {
	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	public boolean dbCheck() {
		if(id.equals("hello") && password.equals("111")) {
			return true;
		}
		return false;
	}
}
