package StringExample;

public class StringIndexOfLastIndexOfEx {

	public  static void main(String args[]) {
		
		String s ="This is IndexOf & Last IndexOf Method";
		
		System.out.println("Index of Method 1:"+s.indexOf('n'));  // 1st position of 'n' will display
		System.out.println("Index of Method 2:"+s.indexOf('n', 5)); // We req 'n' bt its in 1st 5 then ignored it & uske baad wala do
	    System.out.println("Index of Method 3:"+s.indexOf("Last")); // "Last" jha se start hota h uska Index Position dega
	    System.out.println("Index of Method 1:"+s.lastIndexOf('n')); // Reverse Last se 'n' ki Index position search krega
	}
}
