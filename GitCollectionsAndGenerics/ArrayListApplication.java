package Collections;
import java.util.ArrayList;

public class ArrayListApplication {

	public static void main(String[] args) {
		
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
		//Iterating arraylist data using for loop
		for(int i=0;i<animals.size();i++) {
			System.out.println(animals.get(i));
			
		}
		 //Iteration of arraylist using foreach loop
		
		for(String value:animals) {
			System.out.println(value);
			
		}
		
		
	}

}
