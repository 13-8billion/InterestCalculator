/* instantiable class to calculate interest dependent on user input values 
"acctype(account type), access(to money) and amount(to deposit)" 
author @Amy Percival */

public class InterestCalculator{

// delcare instance variables 
	private String accType, access;
	private double amount;
	private double interest;

// decalre constructor to intialise instance variables
	public InterestCalculator(String accType, String access, double amount){
		this.accType = accType;
		this.access = access;
		this.amount = amount;
	}

// default constructor so object of type InterestCalculator can be created in app class with no arguments
	public InterestCalculator(){
	}

// setter methods to set the details provided by the user
	public void setAccType(String accType){
		accType = accType;
	}
	public void setAccess(String access){
		access = access;
	}
	public void setAmount(double amount){
		amount = amount;
	}

// getter method to return the value of the interest result
	public double getInterest(){
		return interest;
	}

// main calculation method to caculate interest depending on what the user inputs
	public void calcInterest(){

// to convert all input to lower case to avoid errors
		accType = accType.toLowerCase();
		access = access.toLowerCase();

		if (accType.equals("12 months term")){ // if..else statement for "12 month term" account type
			if (access.equals("yes")){ // if money access allowed
				interest = amount * 0.0001; // interest will equal input amount * (interest stated in question)
			}else if (access.equals("no")){ // else if money access is not allowed
				interest = amount * 0.0004; // then interest will equal input amount * (interest stated in question)
			}
		}else if (accType.equals("24 months term")){ // if..else statement for "24 month term" account type
			if (access.equals("yes")){
				interest = amount * 0.002;
			}else if (access.equals("no")){
				interest = amount * 0.003;
			}
		}else if (accType.equals("36 months term")){ // if..else statement for "36 month term" account type
			if (access.equals("yes")){
				interest = amount * 0.0025;
			}else if (access.equals("no")){
				interest = amount * 0.05;
			}
		} else { 
			interest = -1; // if account type is invalid
		}
	}
}