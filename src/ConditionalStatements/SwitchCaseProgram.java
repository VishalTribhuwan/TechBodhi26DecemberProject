package ConditionalStatements;

public class SwitchCaseProgram {
	
		public static void main(String args[]) {
		int num=100;                           // num=200; 300 we can use this 
		switch(num) {                          // More than 3 to 5 condition we used Switch stmnt
			
		case 100:
				System.out.println("Value of case 1 is "+num);
				//need to use break else it will go to the next conditional as well 
				break;    //To cross check need to comment out to break stmnt
		case 200:
				System.out.println("Value of case 2 is "+num);
				//break;  // break is compulsory
		default:
					System.out.println("Value of default is "+num);
			}
		}

	}
