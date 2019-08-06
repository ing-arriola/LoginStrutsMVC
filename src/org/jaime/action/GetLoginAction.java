package org.jaime.action;
import org.jaime.commons.validador;

public class GetLoginAction {
	private String username;
	private String password;
	
	public String execute(){
		try{
			validador val= new validador();
			return val.verificar(getUsername(), getPassword());
			
		}catch(Exception e){
			return "falla";
		}
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
