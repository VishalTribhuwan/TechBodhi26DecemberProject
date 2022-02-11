package AbstractionExample;

public abstract class AbstractClass1 {  // Need to add Abstract keyword here
	
	public abstract void abstractmethod1();  // If in our class there is Abstract method available then Our class automatically changed into Abstract
	                                         // Here we r hiding abstractmethod1 details from user & provides its logic in its extended (Next) class
	
	public void simplemethod()     // Non Abstract Method (Simple method).......Here we r showing simplemethod details
	{
		System.out.println("This is simplemethod");

	}

}
// Abstraction:- Hiding the implemented details and showing required details to end user. eg:-ATM Machine

// Types of Abstraction- 1. Abstract Class (0 to 100% Abstraction)  2. Interface (100% Abstraction)

// 1>  Abstract Class:- Using Abstract keyword before class then it is Abstract class. Using Abstract keyword before method then it is Abstract method.

// If method is Abstract then we are not allow any implementation in it. eg:- Abstract void add(){  Blank  }, we are not allowing to provide any login in it due to its Abstract.

// 0-100% Abstr Acheivement:- In our abstract class there are abstract method & non abstract method also available, sometimes we hide some data & we need to show some data. So, this facility provides Abstract Class.

// In program our class is Abstract then class should be Abstract its Mandatory. eg:- public abstract class AbstractClass1 {

// We are not allowing to create Instance of Abstract class. We are creating object through its Implemented class. (In Next Program)

// We are Inherits Abstract class in its extended (Next) class using extends keyword