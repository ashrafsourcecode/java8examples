package core.javas.examples;

import java.util.ArrayList;
import java.util.List;

public class Sortjava8 {

	public static void main(String[] args) {

		 List<Human> humans = new ArrayList();
		 
		 
		 Human h1a = new Human("Sarah", 10); 
		 Human h2b = new Human("Jack", 12);
		 humans.add(h1a);
		 humans.add(h2b);
			    
			    humans.sort(
			      (Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
		
	}

}
