import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetDemo demo= new SetDemo();
		Set hashSetForDemo=demo.createHashSet();
		Set treeSetForDemo=demo.createtreeSet();
		System.out.println("Printing HashSet: ");
		demo.printSet(hashSetForDemo);
		System.out.println("\nPrinting TreeSet: ");
		demo.printSet(treeSetForDemo);
		System.out.println("\nPrinting LinkedHashSet: ");
		demo.printSet(demo.createLinkedHashSet());// can implement this way too
		
	}
	private Set createtreeSet() {
		Set<Integer> setOfIntegers= new TreeSet<>();
		setOfIntegers.add(100);
		setOfIntegers.add(200);
		setOfIntegers.add(40);
		setOfIntegers.add(45);
		setOfIntegers.add(2345);
		setOfIntegers.add(1555);
		setOfIntegers.add(10);
		setOfIntegers.add(40);
		return setOfIntegers;
	}
	private Set createLinkedHashSet() {
		Set<Integer> setOfIntegers= new LinkedHashSet<>();
		setOfIntegers.add(100);
		setOfIntegers.add(200);
		setOfIntegers.add(40);
		setOfIntegers.add(45);
		setOfIntegers.add(2345);
		setOfIntegers.add(1555);
		setOfIntegers.add(10);
		setOfIntegers.add(40);
		return setOfIntegers;
	}
	private Set createHashSet() {
		Set<Integer> setOfIntegers= new HashSet<>();
		setOfIntegers.add(100);
		setOfIntegers.add(200);
		setOfIntegers.add(40);
		setOfIntegers.add(45);
		setOfIntegers.add(2345);
		setOfIntegers.add(1555);
		setOfIntegers.add(10);
		setOfIntegers.add(40);
		setOfIntegers.add(4050);
		return setOfIntegers;
	}
	private void printSet(Set setToPrint) {
		Iterator setIterator=setToPrint.iterator(); 
		while(setIterator.hasNext())	{
			System.out.println("Values of the element in Set: "+setIterator.next());
		}
		
	}

}
