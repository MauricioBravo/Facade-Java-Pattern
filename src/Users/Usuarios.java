package Users;

import java.util.Scanner;

// el plan de esta clase es la de aplicar un inicio de sesion que interactue con el main y
//luego que el main dispare la clase service maker, posiblemente con un tercer 
//patron a aplicar para que el proyecto tenga mas compljidad


public class Usuarios {

	//INGRESAR USUARIO Y CONTRASEÑA
			private String user ="mauri";
			private String password="1234";
			private String user2;
			private String password2;
	
	public Usuarios() {
		
	}
	
	public void login(){
		
		
		try (Scanner myObj2 = new Scanner(System.in)) {
			System.out.println("ingrese usuario y contraseña");	
			user2 = myObj2.nextLine();
				if(user2==user) {
					System.out.println("usuario encontrado");
				}
			password2 = myObj2.nextLine();
		
				if(password2==password) {
					System.out.println("contraseña correcta");
				}
		}
		
	}

	
	
}
