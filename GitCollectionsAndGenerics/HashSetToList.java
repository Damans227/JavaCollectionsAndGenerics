package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetToList {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);

		
		//Converting a HashSet to list comes in handy when you have to sort the hashSet values
ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);

Collections.sort(myList);
System.out.println(myList);
}
}