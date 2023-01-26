package App;

import facade.ServiceMaker;

public class App {

	public static void main(String[] args) {
		
		ServiceMaker cliente1 = new ServiceMaker();
		cliente1.buscar("02/07/2023","08/07/2023", "Mendoza","Potrerillos");
		
		ServiceMaker cliente2 = new ServiceMaker();
		cliente2.buscar("02/05/2023","08/05/2023", "Mendoza","San Rafael");

		
	}

}
