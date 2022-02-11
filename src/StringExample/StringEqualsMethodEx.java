package StringExample;

public class StringEqualsMethodEx {

	public static void main(String[] args) {

		String s = "This is String Equal Method";
		
		String s1 ="Equal";
		String s2 ="Equal";
		System.out.println("Equals Method:-"+ s1.equals(s2));
		
		String s3 ="Method";
		String s4 ="METHOD";
		boolean abc = s3.equals(s4);
		System.out.println("Equals Method:-"+ s3.equals(s4));		
		
		System.out.println("Equals Method:-"+ s3.equalsIgnoreCase(s4));  // EqualsIgnoreCase Example
	}

}
 

