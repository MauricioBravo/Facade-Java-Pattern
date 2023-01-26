package facade;

import IServicio.IntServicio;
import api.Avion;
import api.Hotel;


public class ServiceMaker {

	
		private IntServicio hotel;
		private IntServicio avion;
		
		public ServiceMaker() {
			hotel = new Hotel();
			avion = new Avion();
		}
		
		public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
			hotel.buscar(fechaIda,fechaVuelta, origen,destino);
			avion.buscar(fechaIda,fechaVuelta, origen,destino);
			System.out.println(hotel instanceof IntServicio);
		}

}
