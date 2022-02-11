package StringExample;

public class ImmutableExample {

	public static void main(String[] args) {

		String s="Vishal";
		s.concat("Tribhuwan");
		System.out.println(s);   // Wll print Vishal bcoz String r Immutable objects
		//System.out.println(s.concat("Tribhuwan")); 
	}

}
