package Collections;
import java.util.ArrayList;

public class CollectionsMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		
		
ArrayList<Integer> newList = new ArrayList<Integer>();
newList.add(10);
newList.add(67);
newList.add(15);

//Merging newList to list1:


list1.addAll(newList);

System.out.println("Merging newList to list1 result: "+list1);

//Removing newList from list1

list1.removeAll(newList);

System.out.println("Removing newList from list1 result: "+list1);

//Eliminate all the data in list1


list1.clear();

System.out.println("Eliminating the elements in list1 completely: "+list1);

//Check if particular value exists in list1

boolean hasValue=list1.contains(48);
System.out.println(hasValue);

//retain newList values in list1

//list1.retainAll(newList);
//System.out.println("Retained: "+list1);




	}

}
