package Collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListApplication {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("hello");
		words.add("there");
		words.add("10");
		
		String item1=words.get(2);
		System.out.println(item1);
		
		
		//LinkedList is faster for manipulating data. It has more advanced manipulating functions. But retrieval is slow. 
		
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);

		for(int number:numbers) {
			System.out.println(number);
		}
	}

}
