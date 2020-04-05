import java.util.ArrayList;
import java.util.List;
import java.util.*; 
class ComparatorExample {

	public static void main(String[] args) {
		
		List<Movie> list= new ArrayList<Movie>();
		
		list.add(new Movie(1, "mohan", 55));
		list.add(new Movie(2, "nadal", 33));
		list.add(new Movie(3, "federer", 38));
	
	
		Collections.sort(list);
	
	// Map<Integer, String> map= new HashMap<>();
	
	for (Movie movie: list) {
		//map.put(movie.getId(), movie.getname());
		System.out.println(movie.getId()+" "+ movie.getname()+" "+movie.getage());
		//System.out.println("\n"+ map);
	}

	}}
