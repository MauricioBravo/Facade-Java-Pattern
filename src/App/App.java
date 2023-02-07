package App;

import Users.Usuarios;

public class App {

	public static void main(String[] args) {

		Usuarios usuarioactual = new Usuarios();
		usuarioactual.login();
		
		//System.out.println("llegó");
		
		usuarioactual.buscar();
		
	}
}
