package AbstractionExample;

public class AbstractClass1Implementation extends AbstractClass1 { // using extends keyword (when our child is class) we call AbstractClass1 (Previous Class)
                                                                   // Inherits the previous classname using extends keyword
	                                                               // Error showing on AbstractClass1Implementation, select an Unimplemented option
	@Override                                                      
	public void abstractmethod1() {
		
		System.out.println("Abstract method 1 Implementation");  // Here we r using Business logic frm cmpny perspective
		
	}

	public static void main(String args []) {
		
		//AbstractClass1 ab = new AbstractClass1();  // can not create instance of classname (AbstractClass1)
		
		AbstractClass1 ab1 = new AbstractClass1Implementation();   // 1st way
		ab1.abstractmethod1();
		ab1.simplemethod();
		
		AbstractClass1Implementation abc = new AbstractClass1Implementation();   // 2nd way
		abc.abstractmethod1();
		abc.simplemethod();
	}
}
