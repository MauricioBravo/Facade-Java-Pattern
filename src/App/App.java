package App;

import facade.ServiceMaker;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		final String provincia;
		final String localidad;
		final String fechaSalida;
		final String fechaVuelta;

		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("ingrese la provincia destino");	
			provincia = myObj.nextLine();
			System.out.println("ingrese la localidad destino");	
			localidad = myObj.nextLine();
			System.out.println("ingrese la fecha de salida");	
			fechaSalida = myObj.nextLine();
			System.out.println("ingrese la fecha de regreso");	
			fechaVuelta = myObj.nextLine();
		}
		
			ServiceMaker cliente1 = ServiceMaker.getInstancia();
		cliente1.buscar(fechaSalida,fechaVuelta, provincia,localidad);
	}

}
