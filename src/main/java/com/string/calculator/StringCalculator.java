package com.string.calculator;
import java.util.List;
import java.util.stream.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCalculator {

	
	public int Add(String s) {
		if(!s.isEmpty()) {
			Stream<String> numbers = Arrays.stream(s.split(","));
			return numbers.mapToInt(Integer::parseInt).sum();
		}
		return 0;
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
	

}
