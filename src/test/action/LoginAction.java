package test.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String managerName;

	private String managerPassword;

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	@SuppressWarnings("static-access")
	public String login() {

		if (this.managerName.equals("hongdong")
				&& this.managerPassword.equals("159951")) {
			return this.SUCCESS;
		} else {
			return this.ERROR;
		}

	}

}
