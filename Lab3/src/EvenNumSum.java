import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Userinput;
		
		System.out.println("Go ahead and enter an integer value:"); //enter user input here
		Userinput = scan.nextInt();
		
		while(Userinput < 2) {
			System.out.println("ERROR: Integer must be greater than or equal to 2. Try again!"); //lets user know to try again
			Userinput = scan.nextInt();
			
		}
		
		
		if (Userinput >= 2) {
			int sum = 0; //have set to zero
			
			//using for statement: to read user input, sum up, and the output, making inclusive
			for(int count = 2; count <= Userinput; count += 2) { 
				sum += count;
				
			}
			//7/21/2021 how to make it loop for "Enter a different integer. Without having to manually run it again
			System.out.println("Sum of all even integers between 2 and " + Userinput + " is " + sum + ".\nRun again to try different integer.");
			Userinput = scan.nextInt();
		

		}

			scan.close(); //closing scan
			

		
		}

}
