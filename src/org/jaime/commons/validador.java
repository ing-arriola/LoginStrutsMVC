package org.jaime.commons;

public class validador {

	public String verificar(String user,String pass) {
		
		try {
			if(user.equals("jaime") && pass.equals("1234")) {
				return "exito";
			} else {
				return "falla";
			}
		}
		catch(Exception e){
			return "falla";
		}
		
	
	}

}
