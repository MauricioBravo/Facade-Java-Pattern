package Users;

import java.util.Scanner;
import facade.ServiceMaker;

public class Usuarios {

	// INGRESAR USUARIO Y CONTRASEÑA
	private String user = "mauri";
	private String password = "1234";
	private String user2;
	private String password2;

	// VALORES DE BUSQUEDA
	private String provincia = "";
	private String localidad = "";
	private String fechaSalida = "";
	private String fechaVuelta = "";
	private int opcion;

	// OBJETO PARA LOS IMPUTS
	public Scanner myObj = new Scanner(System.in);

	public Usuarios() {

	}

	public boolean login() {
		boolean estadoUsuario = false;
		boolean estadoClave = false;

		// NO SALIR HASTA QUE SE CUMPLA EL USUARIO Y CLAVE
		do {
			System.out.println("ingrese usuario");
			user2 = myObj.nextLine();
			if (user2.equals(user)) {
				System.out.println("usuario encontrado, ingrese contraseña:");
				estadoUsuario = true;
				do {
					password2 = myObj.nextLine();
					if (password2.equals(password)){
						System.out.println("contraseña correcta");
						estadoClave = true;
					} else {
						System.out.println("contraseña incorrecta");
					}
				} while (estadoClave == false);

			} else {
				System.out.println("usuario incorrecto");
			}

		} while (estadoUsuario == false || estadoClave == false);

		return true;

	}

	public void buscar() {

		// INGRESO DE LAS PREFERENCIAS DE LA BUSQUEDA

		System.out.println("ingrese la provincia destino");
		provincia = myObj.nextLine();

		System.out.println("ingrese la localidad destino");
		localidad = myObj.nextLine();

		System.out.println("ingrese la fecha de salida");
		fechaSalida = myObj.nextLine();

		System.out.println("ingrese la fecha de regreso");
		fechaVuelta = myObj.nextLine();


		// BUSCAR VUELO U HOTEL
		System.out.println("1 para buscar vuelo");
		System.out.println("2 para buscar hotel");
		System.out.println("3 para salir");

		opcion = myObj.nextInt();

		if (opcion == 1) {
			ServiceMaker cliente1 = ServiceMaker.getInstancia();
			cliente1.buscarV(fechaSalida, fechaVuelta, provincia, localidad);
		} else if (opcion == 2) {
			ServiceMaker cliente1 = ServiceMaker.getInstancia();
			cliente1.buscarH(fechaSalida, fechaVuelta, provincia, localidad);
		} else {
			System.out.println("SALIENDO");
			System.exit(0);
		}
	}
}
