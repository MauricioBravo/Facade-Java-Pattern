package facade;

import api.HotelAPI;

public class CheckFacade {

	
		private HotelAPI hotelAPI;
		
		public CheckFacade() {
			hotelAPI = new HotelAPI();
		}
		
		public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
			hotelAPI.buscarHoteles(fechaIda,fechaVuelta, origen,destino);
		}

}
