import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		MapDemo demo=new MapDemo();
		printMap(demo.createMapDemo());

	}
	private Map createMapDemo() {
		Map<Integer, String> employeeMap= new HashMap<>();
		employeeMap.put(1, "S");
		employeeMap.put(2, "M");
		employeeMap.put(100, "A");
		
		for (Map.Entry<Integer, String> ent : employeeMap.entrySet()) {
			int key=ent.getKey();
			String value= ent.getValue();
			System.out.println(key+":"+value);
		}
		return employeeMap;
	}
	private static void printMap(Map<Integer,String> maptoPrint) {
		Set keys= maptoPrint.keySet();
		int key=keys.hashCode();
		System.out.println(key);
		System.out.println(keys);
		System.out.println(maptoPrint);
	}

}
