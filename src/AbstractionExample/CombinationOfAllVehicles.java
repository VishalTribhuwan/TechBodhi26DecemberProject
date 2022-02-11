package AbstractionExample;

public class CombinationOfAllVehicles {


	public static void main(String args[]) {
		
		Vehicle cr = new Car();
		cr.vehicleFeatures();
		
		Vehicle tr = new Truck();
		tr.vehicleFeatures();
		
		Vehicle bc = new BiCycle();
		bc.vehicleFeatures();
				
	}

}
