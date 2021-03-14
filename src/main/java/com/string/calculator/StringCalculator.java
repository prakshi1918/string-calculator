package com.string.calculator;
import java.util.stream.*;
import java.util.Arrays;

public class StringCalculator {

	public int Add(String s) {
		if(!s.isEmpty()) {
			
			String delimiter = ",|\n";
			if(s.startsWith("//")) {
				String[] sub = s.split("\n",2);
				delimiter = sub[0].substring(2);
				s = sub[1];
			}
			
			Stream<String> numbers = Arrays.stream(s.split(delimiter));
			return numbers.mapToInt(Integer::parseInt).sum();
		}
		return 0;
	}
	
	

}
