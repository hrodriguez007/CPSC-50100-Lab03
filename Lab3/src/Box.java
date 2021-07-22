
public class Box {

	int size = 0;
	
	public void printBox() { //method printBox
		
		for(int c = 0; c < size; c++) { //nested for loop represents columns
			
			for(int r = 0; r < size; r++) { //nested for loop represents rows
		
			System.out.print("*"); //printing "*"
		
		}
		
		System.out.println();
	
		}
	
	}	
	
	public static void main(String[] args) { //main method
		Box box = new Box(); //new object for Box class
			box.size = 5; // dot operator
			box.printBox(); //printBox method invoked

	}

}
