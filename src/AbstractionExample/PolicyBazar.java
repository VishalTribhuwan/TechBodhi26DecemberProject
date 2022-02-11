package AbstractionExample;

public class PolicyBazar {
	
	public static void main(String args[]) {
		
		RBI sb = new SBI();
		sb.ROI();
		//System.out.println("SBI ROI-"+sb.getRateOfIntrest()+"%");
				
		RBI ic = new ICICI();
		ic.ROI();
		//System.out.println("ICICI ROI-"+ic.getRateOfIntrest()+"%");

		RBI hd = new HDFC();
		hd.ROI();
		//System.out.println("HDFC ROI-"+hd.getRateOfIntrest()+"%");

		RBI kt = new KOTAK();
		kt.ROI();
		//System.out.println("KOTAK ROI-"+kt.getRateOfIntrest()+"%");
		
	}

}
