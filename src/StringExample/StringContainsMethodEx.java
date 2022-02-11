package StringExample;

public class StringContainsMethodEx {
	
	public static void main(String args[]) {
		
		String s ="This is String Contains Method";  // Contains checks s1 data available in s2 or not
		String s1 ="Contains";
		String s2 ="Con";               // If take "abc" it will be false
		boolean abc =s1.contains(s2);
		
		System.out.println("Contains Method:"+s1.contains(s2));
	}

}
