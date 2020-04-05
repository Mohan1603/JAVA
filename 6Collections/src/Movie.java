
public class Movie implements Comparable<Movie>{
	
	private int id;
	private String name;
	private int age;
	
	public int getId() {return id;}
	public String getname() {return name;}
	public int getage() {return age;}
	
	Movie(){
		
	}

	public Movie(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Movie m) {
		return this.age - m.age;
	}


}
