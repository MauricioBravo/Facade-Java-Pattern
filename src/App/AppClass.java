package App;

import facade.CheckFacade;

public class AppClass {

	public static void main(String[] args) {
		
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2023","08/07/2023", "Mendoza","Potrerillos");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/05/2023","08/05/2023", "Mendoza","San Rafael");
		
		
	}

}
