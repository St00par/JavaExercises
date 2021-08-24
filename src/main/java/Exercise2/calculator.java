package Exercise2;

public class calculator {

	public void addition(double num1, double num2) {
		System.out.println("The answer is " +(num1+num2));
	}

	public void multiply(double num1, double num2) {
		System.out.println("The answer is " +(num1*num2));
	}

	public void subtract(double num1, double num2) {
		System.out.println("The answer is " +(num1-num2));
	}
	
	public void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Cannot divide by zero! Please try again.");
        } else {
            System.out.println("The answer is " +(num1/num2));
		}
	}

}	

