package facade;

import IServicio.IntServicio;
import api.Avion;
import api.Hotel;


public class ServiceMaker {

		private static ServiceMaker instancia;
		private IntServicio hotel;
		private IntServicio avion;
		
		private ServiceMaker() {
			hotel = new Hotel();
			avion = new Avion();
		}
		
		public static ServiceMaker getInstancia() {
			if (instancia ==null) {
				instancia = new ServiceMaker();
				
			}
			return instancia;
		}
		
		
		
		public void buscar(String fechaIda, String fechaVuelta,
			String origen, String destino) {
			
			hotel.buscar(fechaIda,fechaVuelta, origen,destino);
			avion.buscar(fechaIda,fechaVuelta, origen,destino);
			System.out.println(hotel instanceof IntServicio);
		}

}
