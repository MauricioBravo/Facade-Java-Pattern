package App;

import facade.ServiceMaker;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		final String provincia;
		final String localidad ="null";
		final String fechaSalida =" null";
		final String fechaVuelta = "null";
		

		System.out.println("ingrese la provincia destino");	

		try (Scanner myObj = new Scanner(System.in)) {
			provincia = myObj.nextLine();
		}

		


		ServiceMaker cliente1 = ServiceMaker.getInstancia();
		cliente1.buscar(fechaSalida,fechaVuelta, provincia,localidad);

		


	}

}
