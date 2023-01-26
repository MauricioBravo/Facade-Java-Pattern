package api;

import IServicio.IntServicio;

public class Avion implements IntServicio {

	@Override
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("******************");
		System.out.println("Vuelos encontrados para "+ destino + " desde "+ origen);
		System.out.println("Fecha de ida: "+ fechaIda + "Fecha de vuelta "+ fechaVuelta);
		System.out.println("******************");
	
	}

}
