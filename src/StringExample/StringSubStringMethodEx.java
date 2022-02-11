package StringExample;

public class StringSubStringMethodEx {
	
	public static void main(String args[]) {
		
		String s ="This is String SubString Method";
		
		String FullName = s.substring(8);
		System.out.println("Substring - "+ FullName);
		String Name = s.substring(5, 31);
		System.out.println("Substring - "+ Name);
	}

}
