import java.util.Random;
import java.util.Scanner;

public class AgeGuess3 {

	public static void main(String[] args) {
		int ageGuess;
		int age;
		
		Scanner scan = new Scanner(System.in); // a new Scanner object sc is declared
		
		age = new Random().nextInt(100); // random age range (0-100)
		

		
		System.out.print("Please enter age guess:");
		ageGuess=scan.nextInt(); // Accept the age

	
		//user guesses incorrectly, they are prompted to guess again
		while (age != ageGuess) {
			System.out.println("Boo hoo! That's incorrect. Please try again!");
			ageGuess = scan.nextInt();		
		}
		
		//user guesses correctly
		if (age != ageGuess) {
			System.out.println("Winner winner chicken dinner! You did it! :)");
		}
		
		scan.close(); //closing scanner
	
	}
}