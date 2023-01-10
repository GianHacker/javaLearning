package gross_calculator;

public class GrossPayCalculator {
	public static void main(String[] args) {
		System.out.println("Hello World !");
		
		// Get the number of hours worked
		
		int hours = 40;
		
		
		// Get the hourly pay rate
		
		double payRate = 25.50;
		
		// Multiply hours and pay rate
		
		double grossPay = hours * payRate;
		
		// Display result
		
		System.out.println("Gross Pay: "+ grossPay);
	}

}
