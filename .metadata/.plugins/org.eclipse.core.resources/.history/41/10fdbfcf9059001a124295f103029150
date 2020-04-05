

interface Executable{
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("executing code");
		e.execute();
	}
}

public class Lambda {

	public static void main(String[] args) {
		
		Runner r= new Runner();
		r.run(new Executable() {

			@Override
			public void execute() {
				System.out.println("Hello");
			}
			
		});
		r.run(() -> System.out.println("hello all"));
			
	}

}
