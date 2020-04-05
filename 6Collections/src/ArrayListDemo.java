import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List returnedArrayList= new ArrayListDemo().createArrayListDemo();
		//new ArrayListDemo().printArrayListDemo(new ArrayListDemo().createArrayListDemo());

		
	
	List<Integer> cars = new ArrayList<>();
	List<Integer> num = new LinkedList<>();

	
	createArrayListDemo(cars);
	createArrayListDemo(num);
	}
	private static void createArrayListDemo(List list) {


//		cars.add("BMW");
//		cars.add("BENZ");
//		cars.add("AUDI");

		// String array[]= cars.toArray(new String[cars.size()]);

		//return cars;
		for( int i=0;i<1E5;i++) {
			list.add(i);
		}
		Long start=System.currentTimeMillis();
		System.out.println(start);
		
			for( int i=0;i<1E5;i++) {
				list.add(0,i);
			}
			Long end=System.currentTimeMillis();
			System.out.println(end);
			System.out.println(end - start);
		}
	

//	private void printArrayListDemo(List list) {
//
//		Iterator listIterator = list.iterator();
//		while (listIterator.hasNext()) {
//			// listIterator.remove(); if you want to remove
//			System.out.println("Print the values in list: " + listIterator.next());
//		}
//
//	}
	
}
