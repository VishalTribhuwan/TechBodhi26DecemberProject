package ConditionalStatements;

import java.util.Scanner;

public class IfElseIfExample {
	
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==b)
		{
			System.out.println("Equal");
		}
		
		else if (a > b)   // For Multiple Conditions we used else if stmnt
		{
			System.out.println("a is greater");
		}
		
		else {
			
			System.out.println("a is lesser");
			
		}
		
	}
	}
	

		
