/**
 * Ashley Clark 
 * A program that takes the user's string input that is divisible by 3
 * then calculates how many changes the string needs for it to read PER until the end of the users input
 * So if a user enters SECRET the output would be 4 because it took 4 changes to get "SECRET" to read "PERPER"
 */



import java.util.Scanner;// import the Scanner class to get the user's input
public class cryptProblem {

	public static void main(String[] args) {
		//main method to prompt the user to enter a string
		Scanner scanner = new Scanner(System.in); // sets up a scanner to read the user's String value
		System.out.print("Please enter a string that is divisable by 3:");
		String userCreatedStr = scanner.nextLine();//Takes the user's input and stores it in the userCreatedstr var
		String name="PER";// String to compare the user's input with
		
		int userStrLength= userCreatedStr.length();//keeps track of the length of the user's string
		int nameLength= name.length();//keeps track of "PER" length
		int count=0;// variable to keep track of the number of changes needed in the user's string
		String replaceString= userCreatedStr.replace(userCreatedStr, name);
		
		if (userCreatedStr.equals(name)) {// check to see if the user's input matches exactly without change
			System.out.print("0");// Prints zero because no change is needed.
		}
		else
			System.out.print(replaceString);
			
			//for(int i= 0; i<=userCreatedStr.length(); i++) {
	//	String replaceString= userCreatedStr.replace(userCreatedStr, "PER");
			//}
			
			//if (userCreatedStr.length()==name.length()) {
				
				
			}
		}
	
		
			
		

	


