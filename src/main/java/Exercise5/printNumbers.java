package Exercise5;

public class printNumbers {
	
public void oneToTen() {
	for (int i = 1; i <= 10; i++) 
		System.out.println(i);
}
	
public void hundredsAndThousands() {
	for (int j = 100; j <1000; j++)
		System.out.println(j);
}

public void numberWords() {
	for (int k = 1; k <= 10; k++) 
		if (k == 1) {
			System.out.println("One");
		} else if (k == 2) {
			System.out.println("Two");
		} else if (k  == 3) {
			System.out.println("Three");
		} else if (k == 4) {
			System.out.println("Four");
		} else if (k == 5) {
			System.out.println("Five");
		} else if (k == 6) {
			System.out.println("Six");
		} else if (k == 7) {
			System.out.println("Seven");
		} else if (k == 8) {
			System.out.println("Eight");
		} else if (k == 9) {
			System.out.println("Nine");
		} else if (k == 10) {
			System.out.println("Ten");
		}
}
}