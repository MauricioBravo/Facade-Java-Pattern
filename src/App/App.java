package App;

import facade.ServiceMaker;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//DECLARACION DE VARIABLES
		final String provincia;
		final String localidad;
		final String fechaSalida;
		final String fechaVuelta;
		final int opcion;
		
		try (//OBJETO PARA LOS IMPUTS
		Scanner myObj = new Scanner(System.in)) {
			
			//INGRESO DE LAS PREFERENCIAS DE LA BUSQUEDA
				System.out.println("ingrese la provincia destino");	
				provincia = myObj.nextLine();
				System.out.println("ingrese la localidad destino");	
				localidad = myObj.nextLine();
				System.out.println("ingrese la fecha de salida");	
				fechaSalida = myObj.nextLine();
				System.out.println("ingrese la fecha de regreso");	
				fechaVuelta = myObj.nextLine();
				
				
			//BUSCAR VUELO U HOTEL
			System.out.println("1 para buscar vuelo");	
			System.out.println("2 para buscar hotel");	
			System.out.println("3 para salir");	
			opcion = myObj.nextInt();
		}
		
		
		if(opcion==1) {
			ServiceMaker cliente1 = ServiceMaker.getInstancia();
			cliente1.buscarV(fechaSalida,fechaVuelta, provincia,localidad);
		}
		else if(opcion==2) {
			ServiceMaker cliente1 = ServiceMaker.getInstancia();
			cliente1.buscarH(fechaSalida,fechaVuelta, provincia,localidad);
		}	
		else {
			System.out.println("Opcion incorrecta");
			
		}
	}
}

