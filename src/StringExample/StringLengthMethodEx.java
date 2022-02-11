package StringExample;

public class StringLengthMethodEx {
	
	public static void main(String args[]) {
	
	String s ="This is String Length Method Example";	
	int a=s.length();
	System.out.println("Length of String is -"+a);
	
	
	String s1 ="My Credit Card No is 12456";	
	int b=s1.length();
	System.out.println("Length of  String is -"+b);
	
	String name ="Vishal Tribhuwan";
	String email ="tribhuwan.vishal@gmail.com";
	System.out.println(email.length());
	
	
	
	String name1 ="Vishal Tribhuwan";   // Here we can use If Else condition also
	int i = name1.length();
	
	if(i==0)
	{
		System.out.println("Name is empty");
	}
	else
	{
		System.out.println("Valid Name");
	}

	
	
	String name2 ="Vishal Tribhuwan";   // isEmpty Method
    boolean e = name2.isEmpty();
    if(e==true)
    {
    	System.out.println("Name is empty");
    }
    else
    {
    	System.out.println("Valid Name");
    }
	}
}