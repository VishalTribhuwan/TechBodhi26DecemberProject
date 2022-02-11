package Polymorphism;

//public class MethodOverRidingEx {       // Java by Deepak

	class Test
	{	
		void show()
		{
			System.out.println("this is method a");
		}
	}

	class XYZ extends Test
	{
		void show()
		{
			System.out.println("this is method b");
		}
	}
	
	public class MethodOverRidingEx {
		
		void show()
		{
		System.out.println("This is OverRidingEx");
	}
		
		public static void main(String args []) {
			
			//Test t = new Test();
			//t.show();
			
			XYZ x = new XYZ();
			x.show();
			
			Test t = new Test();
			t.show();
			
			MethodOverRidingEx m = new MethodOverRidingEx();
			m.show();
			
		}
}

			
		
	



