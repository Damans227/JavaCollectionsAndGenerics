//HashSet ignores order/ sequence in which elements are added to set
//LinkedHashSet can be used to retain order of elements

//HashSet removes ignores duplicate values
//HashSet only cares about unique values

package Collections;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class SetApplication {

	public static void main(String[] args) {
		
		HashSet<String> values=new HashSet<String>();
		values.add("Random");
		values.add("Dog");
		values.add("Cat");
		values.add("Zoo");
		values.add("Random");
		
		for(String value: values) {
			System.out.println(value);
		}
		System.out.println("****************");
		
		LinkedHashSet<String> valuesLinked=new LinkedHashSet<String>();
		valuesLinked.add("Random");
		valuesLinked.add("Dog");
		valuesLinked.add("Cat");
		valuesLinked.add("Zoo");
		valuesLinked.add("Random");
		
		for(String valueLinked: valuesLinked) {
			System.out.println(valueLinked);
		}
	}

}
