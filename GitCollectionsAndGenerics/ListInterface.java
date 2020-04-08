package Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ListInterface {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	   List<Integer> values= new ArrayList<Integer>();

		values.add(3);
		values.add(88);
		values.add(5);
		values.add(77);
		
		/*Iterator i = values.iterator();
		 * while(i.hasNext()){
		 * 
		 * System.out.println(i.next());
		 * 
		 * }*/
		Collections.sort(values);
		
		for( int i: values){
			
			System.out.println(i);
		}
		
		
		
	}

}
