package week1VariablesAndOperations;

public class week1VariablesAndOperations {

	public static void main(String[] args) {
		// create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 7;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 13.45;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'J';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customers's first name
		String firstName = "James";
		
		//create a variable to hold a street address
		String streetAddress = "16 hackfeld Road ";
		
		//print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + "is the price of groceries.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + firstName);
		System.out.println(streetAddress + " is where the person lives.");

		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery list
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'K';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customers' first name, middle initial and a last name of your choice
		String lastName = "Boss";
		String fullName = firstName + ' ' + middleInitial + ' ' + lastName;
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hi,my name is " + fullName + " and I live at " + streetAddress + '.' );
	}

}
