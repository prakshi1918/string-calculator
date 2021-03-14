package com.string.calculator;
import java.util.stream.*;
import java.util.Arrays;

public class StringCalculator {
	//StringCalculator(String delimiter)

	public int Add(String s) {
		if(!s.isEmpty()) {
			
			String delimiter = ",|\n";
			if(s.startsWith("//")) {
				String[] sub = s.split("\n",2);
				delimiter = sub[0].substring(2);
				s = sub[1];
			}
			
			if( Arrays.stream(s.split(delimiter)).mapToInt(Integer::parseInt).anyMatch(num -> num<0)) {
				throw new IllegalArgumentException("negative number: -7");
			}
			return  Arrays.stream(s.split(delimiter)).mapToInt(Integer::parseInt).sum();
		}
		return 0;
	}
	
	

}
