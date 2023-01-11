
public class Bird {
	
	String bird;
	int age;
	String name;
	String place;
	
	public Bird(String bird, int age, String name, String place) {
		super();
		this.bird = bird;
		this.age = age;
		this.name = name;
		this.place = place;
	}
	public void personaDetails() {
		System.out.println("I am "+ bird +" species");
		System.out.println("I am "+age+" years old");
		System.out.println("People call me as "+name);
	}
	public void address() {
		System.out.println("I am currently residing in "+place+" zoo park");
	}

}
