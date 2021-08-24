package Exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Exercise6.collections;

public class streams {
	
collections col = new collections();

public void streamHundred() {
List<Integer> listOfNumbers = new ArrayList<Integer>();
for (int i = 1; i <= 101; i++) {
	if (i<=100) {
    listOfNumbers.add(i);
	} else {
    listOfNumbers.stream().forEach(x -> System.out.println(x));
}
}
}

public void streamThousand() {
List<Integer> listOfNums = new ArrayList<Integer>();
for (int j = 100; j <= 1001; j++) {
	if (j<=1000) {
    listOfNums.add(j);
	} else {
    listOfNums.stream().forEach(x -> System.out.println(x));

	List<Integer> hundred = listOfNums.stream().map(n -> n * 100).collect(Collectors.toList());
	System.out.println(hundred);
}
}
}
}