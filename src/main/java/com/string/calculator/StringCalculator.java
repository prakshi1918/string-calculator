package com.string.calculator;
import java.util.stream.*;
import java.util.Arrays;

public class StringCalculator {

	public int Add(String s) {
		if(!s.isEmpty()) {
			Stream<String> numbers = Arrays.stream(s.split(",|\n"));
			return numbers.mapToInt(Integer::parseInt).sum();
		}
		return 0;
	}
	
	

}
