package org.nirbo.AdShow.login;

import javax.faces.bean.ManagedBean;

import org.nirbo.AdShow.login.model.AdminLoginCredentials;

@ManagedBean(name = "AdminLogin")
public class AdminLogin {

	AdminLoginCredentials adminCreds = new AdminLoginCredentials();
	
	public void login(String username, String password) {
		
	}
	
}
