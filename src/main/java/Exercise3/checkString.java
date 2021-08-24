package Exercise3;

import java.util.Scanner;

public class checkString {

public void hardString() {	
	String s1 = "Hello World";
    String s2 = "Hello World";
    boolean areStringsEqual = s1.equals(s2);
         
    System.out.println("Are the two hard coded strings equal? : "+areStringsEqual);
}

public void stringScan() {
	Scanner scan = new Scanner(System. in);
	System.out.print("Enter first string : ");
	String str1 = scan.nextLine();
	         
    System.out.print("Enter second string : ");
	String str2 = scan.nextLine();
	        
	boolean areTwoStringsEqual = str1.equals(str2);
	 
    System.out.print("Are the two user inputted strings equal? : "+areTwoStringsEqual);
	scan.close();
}	
}
