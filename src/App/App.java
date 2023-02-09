package App;

import Users.Usuarios;

public class App {

	public static void main(String[] args) {
		
		boolean loginStatus = false;

		Usuarios usuarioactual = new Usuarios();
		
		loginStatus=usuarioactual.login();
		if(loginStatus==true) {
			usuarioactual.buscar();
		}		
	}
}
