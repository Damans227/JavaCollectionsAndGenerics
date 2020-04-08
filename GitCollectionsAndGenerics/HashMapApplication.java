package Collections;
import java.util.HashMap;
import java.util.Map.Entry;

//Used for Key-value pairs. HashMap, LinkedHashMap, TreeMap(Sorts the keys in natural order).

public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("Brave","ready to face or endure danger");
		dictionary.put("Brilliant","exceptionally clever");
		dictionary.put("Joy","feeling of pleasure and happiness");
		dictionary.put("Confidence","state of being certain");

		//Printing only keys:
		
		for(String word: dictionary.keySet()) {
			System.out.println(word);
		}
		System.out.println("******************");
		
		//Printing only values
		
		for(String word: dictionary.keySet()) {
			System.out.println(dictionary.get(word));
		}
		System.out.println("******************");
		
		//Printing key-value
		
		for(Entry<String, String> entry: dictionary.entrySet()) {
			System.out.print(entry.getKey());
			System.out.println(": "+entry.getValue());
			
			
		}
		

	}

}
