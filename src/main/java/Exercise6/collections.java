package Exercise6;

import java.util.ArrayList;
import java.util.List;

public class collections {
	

public void arrayHundred() {	
List<Integer> listOfNums = new ArrayList<Integer>();
for (int i = 1; i <= 101; i++) {
	if (i<=100) {
    listOfNums.add(i);
	} else{
    System.out.println(listOfNums);
	}
	}
}

public void listThousand() {
List<Integer> listOfNum = new ArrayList<Integer>();
	for (int j = 100; j <= 1001; j++) {
		if (j<=1000) {
	    listOfNum.add(j);
		} else{
	    System.out.println(listOfNum);
	    
	    for (int k=0; k<listOfNum.size(); k++) {  
	    	  System.out.println(listOfNum.get(k)*100);
		}
		}
	}
}
}
