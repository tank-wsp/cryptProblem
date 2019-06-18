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
		int userStrLength= userCreatedStr.length();//keeps track of the length of the user's string
		int count=0;// variable to keep track of the number of changes needed in the user's string
		
	
		for(int i=0; i<=userCreatedStr.length()-1; i++) {// divides the string by 3 and checks to see if the first letter is p if not it increases the count
				if(i%3==0 && userCreatedStr.charAt(i)!='P') {
				  count++;
				  
				}
				  
					
				  
					if(i%3==0 && userCreatedStr.charAt(i+1)!='E') {//divides the string by 3 and checks to see if the first letter is E if not it increases the count
						count++;
					}
				
					
					
						if(i%3==0 && userCreatedStr.charAt(i+2)!='R') {//divides the string by 3 and checks to see if the first letter is R if not it increases the count
							count++;
						}
				}
						
						
					System.out.print(count);//prints the total count of "days" it took to change the output to read PER until the end of the string

					
						}
				}
			

			
			
					
					
				

	
			
	


				
