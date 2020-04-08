// Java is a type safe language. However, Collections API returns objects which are not type safe protected. 
//We can achieve type safety with collections you have to use generics.
package Collections;
import java.util.List;
import java.util.ArrayList;

//Creating a generic class

class Container<T>{ // Container<T extends Number> This will allow only those classes which extend Number class i.e Integer or Float
	
	T value;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public void show() {
		
		System.out.println(value.getClass().getName());
	}
	
}

public class GenericsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int value=5;
		List values = new ArrayList();
		
		values.add(7);
		values.add("navin");
		
		int i = Integer.parseInt(values.get(1).toString());
		System.out.println(i);*/
		
		Container<Integer> obj=new Container<>(); //You can also use Double or String etc
		obj.value=9;
		obj.show();

	}

}
