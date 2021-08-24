package Exercise4;

import java.util.Scanner;

import Exercise2.calculator;

public class calcScanner {
	
public void runScannerCalc() {		
		boolean running = true;
			
		while (running) {
		Scanner scan = new Scanner(System.in);
		calculator calc = new calculator();
		
		System.out.println("Enter your first number...");
	    double num1 = scan.nextDouble();
	    
	    System.out.println("Enter your second number...");
	    double num2 = scan.nextDouble();
	   
	    System.out.println("What would you like to do? Add = 1, Subtract = 2, Multiply = 3, Divide = 4 or Quit = 0");
		int operator = scan.nextInt();
	    
		switch (operator) {
		
		case 1:
			if (operator==1)
			calc.addition(num1,num2);
			break;
		case 2:
			if (operator==2)
			calc.subtract(num1,num2);
			break;
		case 3: 
			if (operator==3)
			calc.multiply(num1,num2);
			break;
		case 4:
			if (operator==4) 
			calc.divide(num1,num2); 
			break;
		case 0:
			if (operator==0)
			scan.close();
			running = false;
			System.out.println("The calculator is closed.  Thank you for using calculator, see you again soon!");
			break;
		default:
			System.out.println("Your calculation cannot be performed.  Please select a valid option (1-4) next time!");
			break;
		}
		}
	}
}
