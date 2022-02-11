package Encapsulation;

public class Encapsulation1 {
	
	private String Name;        // data hiding (Private) It is nt used outside Encapsulation1 class.....(Name-Instance Variable)
	
	//getter method for name
	public String getName() {
	return Name;                // code acting on a data in a single unit
	}
	//setter method for name
	public void setName(String Name) { // Yha se jo Runtime pr Name aayega, we assigned it to (private String Name;).....(Name-Local Variable)
	this.Name=Name;             // this.Name-  avoiding the ambiguity  between Name (Instance & Local Variable)
	}                           // If names are same to difference btwn Instance & Local variable we used this keyword	
	                            // this keyword is used to refer current class instance variable
}

// Encapsulation is data hiding (making all members of class Private)

// Encapsulation is wrapping the data (Variable) & code acting (methods & constr) on data i.e. method in single unit

// We can use setter & getter method to set and get data 

// As we can say, Variables ko Private krte h & uski jo method hoti h jo us pr act kregi woh Public banate h. 

// Eg:-panCard (We can nt change the panCard dtls)....panCard Variable Private & uske upr jo methods act krt thi usko public. Setter method k andar Public kr diya, Getter nt used here

// Getter & Setter's methods are used to create, modify, delete & view the variables values

// If you need to access private variables, you have to use public "getter" and "setter" methods

// Encapsulation class is easy to test. So, it is better for Unit Testing

// Encapsulation is also improves the re-usability & easy to change with new requirements