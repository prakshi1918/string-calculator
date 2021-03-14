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
			
			if( getNumberStream(delimiter,s).anyMatch(num -> num<0)) {
				String negativeNumberSequence = getNumberStream(delimiter,s).filter(n->n<0)
						.mapToObj(Integer::toString)
						.collect(Collectors.joining(","));
				throw new IllegalArgumentException("negative number: "+negativeNumberSequence);
			}
			return  getNumberStream(delimiter,s).sum();
					//Arrays.stream(s.split(delimiter)).mapToInt(Integer::parseInt).sum();
		}
		return 0;
	}
   public IntStream getNumberStream(String delimiter,String s) {	
	return Arrays.stream(s.split(delimiter))
		.mapToInt(Integer::parseInt);
		//.anyMatch(num -> num<0)
   }
}
