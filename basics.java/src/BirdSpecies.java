
public class BirdSpecies {
	
	public static void main(String[] args) {
		
		Bird peacock = new Bird("Peacock", 2, "Rainbow", "Hyderabad");
		peacock.personaDetails();
		peacock.address();
		
		Bird parrot = new Bird("Parrot", 3, "Sweety", "Bengaluru");
		parrot.personaDetails();
		parrot.address();
		
		Bird sparrow = new Bird("Sparrow", 1, "Kichuk", "Chennai");
		sparrow.personaDetails();
		sparrow.address();
	}

}
