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


// primero terminar el estrategia.
// el metodo se tiene que llamar igual pero depende que quiero buscar elijo el objeto.
//objeto.buscar ( que debe saber si es oavion o no)
// despues el fachada que es intefarz de interfaces. va sobre el fachada entonces me cuesta menos programarlo.
//mpalma@uch.edu.ar pedir material
//marcelo.palma.a@gmail.com