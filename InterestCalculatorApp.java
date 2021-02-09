/* app class to take user input values and display the results of calculation
in instantiable class.
author @Amy Percival */

// import scanner class to enable user input
import java.util.Scanner;

public class InterestCalculatorApp{

//declare main method
	public static void main (String [] args){

// create scanner variable and object
		Scanner input = new Scanner(System.in);

// declare variables
		String type, yn;
		double amount;

// create variable and object of data type InterestCalculator with no arguments	
		InterestCalculator calcObj = new InterestCalculator();

// input		
		System.out.println("Enter the type of fixed term deposit account: ");
		type = input.nextLine();
		calcObj.setAccType(type); // call setter method
		System.out.println("Does your account allow access to your money before the term ends? (yes/no): ");
		yn = input.nextLine();
		calcObj.setAccess(yn); // call setter method
		System.out.println("Enter the amount of money to deposit: ");
		amount = input.nextDouble();
		calcObj.setAmount(amount); // call setter method

// create object of data type InterestCalculator with arguments
		calcObj = new InterestCalculator (type, yn, amount);

// processing
		calcObj.calcInterest(); // call method from instantiable class to calculate the interest

// output		
		double interest;
		interest = calcObj.getInterest(); // call getter method from instantiable class to return the interest value
		if (interest != -1){ // if interest value is not equal to -1
			System.out.println("The interest paid is: " + interest); // print the interest result	
		}else if (!type.equals("12 months term") || !type.equals("24 months term") || !type.equals("36 months term")){ // incorrect account type
			System.out.println("Account type not valid"); // print error
		}else if (!yn.equals("yes") || !yn.equals("no")){ // if yes or no not entered
			System.out.println("Please enter yes or no"); // print error
		} else { // if interest value is equal to -1
			System.out.println("Invalid input"); // print error
		}
	}
}