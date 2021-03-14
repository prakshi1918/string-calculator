package com.string.calculator;

public class StringCalculator {

	
	public int Add(String s) {
		String[] numbers = s.split(",");
		if(s.isEmpty())
			return 0;
		if( s.length() == 1)
			return stringToInt(s);
		else
			return Integer.parseInt(numbers[0])+ Integer.parseInt(numbers[1]);
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
	/*public static void main(String[] args) {
		
		
	}*/

}
