package Collections;
import java.util.ArrayList;

public class ArrayListVehicle {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		
		Vehicle vehicle2=new Vehicle("Toyota","Camery",12000,false);
		
		vehicles.add(new Vehicle("Honda","accord",1000,false)); //vehicle created on the fly
		
		vehicles.add(vehicle2);
		
		vehicles.add(new Vehicle("Jeep","Wrangler",25000,true)); //vehicle created on the fly
		
		for(Vehicle car: vehicles) {
			System.out.println(car);
			;
		}
			
		}
		
		
	}

