package Collections;
import java.util.ArrayList;
import java.util.List;

public class VehicleAnimal {

	public static void main(String[] args) {
		
		//Vehicle ArrayList
		
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		
		Vehicle vehicle2=new Vehicle("Toyota","Camery",12000,false);
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Honda","accord",1000,false)); //vehicle created on the fly
		vehicles.add(new Vehicle("Jeep","Wrangler",25000,true)); //vehicle created on the fly
		

		//Animal ArrayList
		
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
printElements(vehicles);
printElements(animals);
			
		}
	public static void printElements(List someList) { //General iteration method using List interface
		
		for(int i=0;i<someList.size();i++) {
			System.out.println(someList.get(i));
		}
	}
		
		
	}

