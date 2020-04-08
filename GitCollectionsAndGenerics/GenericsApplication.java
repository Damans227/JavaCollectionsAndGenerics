package Collections;

import java.util.HashSet;
import java.util.Set;

public class GenericsApplication {

	public static void main(String[] args) {
		
		
		GenericsContainer<Integer,String> cont=new GenericsContainer<>(12,"Hello");
		int val1=cont.getItem1();
		String val2=cont.getItem2();

	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
		
	}

}
