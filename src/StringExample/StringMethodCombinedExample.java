package StringExample;

public class StringMethodCombinedExample {

	public static void main(String[] args) {
		
		String s = "My name is Vishal Tribhuwan";
		
		// 1. Length Method
		
		int abc = s.length();	
		System.out.println("Length of string is -"+abc);
		
		// 2. charAt Method
		
		char charatt = s.charAt(15);
		System.out.println("Character at perticular index:- "+charatt);
		
		// 3. Substring Method
		
		String fullName = s.substring(11);
		System.out.println("Substring:-"+ fullName);
		String Name = s.substring(11, 17);
		System.out.println("Substring:-"+ Name);
		
		// 4. equals Method

		String s1 = "Vishal";
		String s2 = "Vish";                                    // Vishal (True) abc (False)
		boolean cde = s1.equals(s2);
		System.out.println("Equals Method:" + s1.equals(s2));
		
		// 5. contains Method
		
		String s3 = "Vishal";
		String s4 = "abc";                                  // "abc" nt Same ,as "Vishal" so its False
		boolean fgh = s3.contains(s4);
		System.out.println("Contains Method:" + s3.contains(s4));

		// index of, last indexof Method      // Pending, Need to chck Again
		
	    // String s1 = s.indexOf('a');
	     System.out.println("Index of Method 1:"+s.indexOf('a'));  // Index position of 'a', Its return Int value
	     
	    // String s1 = s.indexOf('a', 6);
	     System.out.println("Index of Method 2:"+s.indexOf('a', 6)); // We req 'a' bt its in 1st 6 then ignored it & uske baad wala do
	     
	     //
	     System.out.println("Index of Method 3:"+s.indexOf("Vishal")); // Vishal jha se start hota h uska Index Position dega
	     
	     //
	     System.out.println("Last Index of Method 1:"+s.lastIndexOf('a')); // Reverse Last se 'a' ki Index positon search krega
	     
	     // 6. concat Method
	     
	     String con1 = "Vishal";
	     String con2 = "Tribhuwan";
	     System.out.println("Concat :-"+ con1.concat(con2));
	     
	     // 7. Replace Method
	     
	     //String s =("Vishal");
	    // String s =("Tribhuwan");
	     System.out.println("Replace :-"+s.replace("Vishal", "Tribhuwan"));
	     
	     // 8. uppercase lowercase Method
	     
	     System.out.println("Uppercase:-"+s.toUpperCase());
	     System.out.println("Lowercase:-"+s.toLowerCase());
	     
	     // 9. Split Method
	     
	    String[] splt = s.split(" "); 
	    for(String a:splt) {                 // for each loop used fr fetching the all values of Collection
	    	
	    	System.out.println("eachvalue of splitted string:-......."+a);
	    	
	    // 10. join Method
	    	
	    	String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven");
	    	System.out.println("JoinExample----"+gfg1);
	    }
	     
	   
	}

}
