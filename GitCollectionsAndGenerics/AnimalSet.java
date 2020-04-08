//HasSet recognizes the two values as duplicate if their generated hash Code is same.

package Collections;
import java.util.HashSet;

public class AnimalSet {

	public static void main(String[] args) {
		HashSet<Animal> animals=new HashSet<Animal>();
		
		Animal animal1=new Animal("Dog",12);
		Animal animal2=new Animal("Cat",12);
		Animal animal3=new Animal("Bird",12);
		Animal animal4=new Animal("Dog",12);
		Animal animal5=new Animal("Kangaroo",12);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		//You will notice in your output DOG value even duplicate is not ignored. To fix that override the hashCode. 
		
	
		
		for(Animal value: animals) {
			System.out.println(value);
		}

	}

}
