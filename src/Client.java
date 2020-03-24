import java.io.BufferedReader;
import java.util.Random;
import java.io.InputStreamReader;

public class Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Randomly generates a number for the person to guess using the Math function
		Random rand = new Random();
		int randomNumber = rand.nextInt(101) + 1;
		
		int numberToGuess = randomNumber;
		boolean found = false;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String numberAsString = null;
		int number = -1;
		
		String compareResult = null;
		int attemptedGuesses = 0;
		
		try {
			System.out.println("Enter something!");
			
			while(found == false) {
				attemptedGuesses++;
				try {
					numberAsString = br.readLine();  // Cursor
					number = Integer.parseInt(numberAsString);
					
				}
				catch(Exception e) {
					
				}
				
				System.out.println("numberAsString is: " + numberAsString);
			
				// Quit y/n:
				if(numberAsString.equals("Q")) {
					found = true;
				}
				else {
					
				}
				
				
				
				// Tests the number to see if it is
				// correct, low, or high of the numberToGuess
				if (numberToGuess < number || numberToGuess > number) {
					if (numberToGuess < number) {
						compareResult = " too high.";
						System.out.println("You have made " + attemptedGuesses + " attempt(s).");
					}
					else {
						compareResult = " too low.";
						System.out.println("You have made " + attemptedGuesses + " attempt(s).");
					}
				}
				else {
					compareResult = " correct.";
					System.out.println("You have made " + attemptedGuesses + " attempt(s).");
					found = true;
				}
				
				// counts each attempt made and, if at 7,
				// ends the game otherwise incrementing until
				// attemptedGuesses == 7
				if (attemptedGuesses == 7)
				{
					System.out.println("You have made " + attemptedGuesses + " attempt(s) and have failed."
							+ "The number was : " + randomNumber);
					found = true;
				}
				
				System.out.println("number entered is " + number + " and is" + compareResult);
			}
			
		}
		catch(Exception e) {
			
		}
		
		System.out.println("Quit!");
	}

}
