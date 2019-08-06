package org.jaime.action;


public class GetLoginAction {
	private String username;

	public String execute(){
		return "exito";
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	
}
