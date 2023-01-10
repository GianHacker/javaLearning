
public class Earth {
	public static void main(String args[]) {
		
		/*Human tom; /* Here the variable tom is called as instance variable because
		it refers or points to the object or instance */
		/*
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "Blue";
		tom.name = "Tom";
		tom.heightInInches = 40;
		
		tom.speak();
	///////////////////////////////////////			
		Human bob = new Human();
		bob.name = "Bob the Builder";
		bob.age = 15;
		bob.eyeColor = "Brown";
		bob.heightInInches = 70;
		
		bob.speak();
		bob.walk();
		bob.work();
		bob.eat(); */
		
		Human h1 = new Human("Tom", 25, 75, "Blue");
		Human h2 = new Human("Joe", 30, 76, "Brown");
		
		h1.speak();
		h2.speak();
	}

}
