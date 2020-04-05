import java.util.*;

public class SortListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integer= new ArrayList<>();
		integer.add(55);
		integer.add(22);
		integer.add(16);
		integer.add(98);
		
//		System.out.println("Before Sort: ");
//		
//		for (int value: integer){
//			System.out.println(value);
//		}
//		Collections.sort(integer);
//		
//		System.out.println("\nAfter Sort: ");
//		for (int value: integer) {
//			System.out.println(value);
//		}
		integer.forEach(n -> System.out.println(n));

	}

}
