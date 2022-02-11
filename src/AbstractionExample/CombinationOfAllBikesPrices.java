package AbstractionExample;

public class CombinationOfAllBikesPrices {
	
	public static void main(String args[]) {
		
		Bikes ac = new Apache160();
		ac.BikesPrices();
		
		Bikes ps = new Pulsar160();
		ps.BikesPrices();
		
		Bikes fz = new FZ160();
		fz.BikesPrices();
	}

}
