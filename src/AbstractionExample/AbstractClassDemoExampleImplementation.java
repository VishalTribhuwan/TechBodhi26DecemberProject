package AbstractionExample;

public class AbstractClassDemoExampleImplementation extends AbstractClassDemoExample {

	@Override
	public void abstractmethod1() {

		System.out.println("Abstract method1 Implementation");
	}

	public static void main(String args[]) {
		
	//	AbstractClassDemoExample abc1 = new AbstractClassDemoExample(); // nt allowing to create Instance of Abstractclass
		
		AbstractClassDemoExample abc1 = new AbstractClassDemoExampleImplementation(); // 1st way
		abc1.abstractmethod1();
		abc1.simplemethod();
		
		AbstractClassDemoExampleImplementation abc = new AbstractClassDemoExampleImplementation(); // 2nd way...It will be cleared at Runtime Polymorphism method
		abc.abstractmethod1();
		abc.simplemethod();
	}
}