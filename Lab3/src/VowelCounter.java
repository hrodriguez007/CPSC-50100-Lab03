import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String text;
		
		int a = 0, e = 0, i = 0;
		int o = 0, u = 0, nonvowels = 0;
		
		//string text from the user
		System.out.println("Enter a string for the counter please.");
		text = scan.nextLine();
		

		//scanning the string for vowels and nonvowels
		for(int count = 0; count < text.length(); count ++) {
		    char c = text.charAt(count);

		    if (c=='a') 
		    a++; 
		    
		    
		    else if( c=='e') 
		    e++;
		    
		    
		    else if(c=='i') 
		    i++;
		    
		   
		    else if(c=='o') 
		    o++;
		    
		    
		    else if (c=='u') 
		    u++;        
		    
		    
		    else if (Character.isAlphabetic(text.charAt(count)))  //to exclude the spaces in between words, not count as nonvowels
		    nonvowels++;
		    	}
		    
			

				System.out.println("Number of a's in the string= " + a);
				System.out.println("Number of o's in the string= " + o);
				System.out.println("Number of i's in the string= " + i);
				System.out.println("Number of e's in the string= " + e);
				System.out.println("Number of u's in the string= " + u);
				System.out.println("Number of nonvowels in the string= " + nonvowels + ".\nRun again to try a different string.");
				
				
				scan.close(); //closing scanner
				
					}
			

			}
		