package StringExample;

public class StringJoinMethodEx {

	public static void main(String[] args) {
		
		String s ="This is String Join Method";

		String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven"," ","10");
    	System.out.println("JoinExample----"+gfg1);
    	
    	String abc = s.join("Vishal", "This", "is", "Join", "Method");
    	System.out.println("JoinExample-----+"+abc);
    }
	

}
