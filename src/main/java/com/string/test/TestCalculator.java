package com.string.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;
import com.string.calculator.StringCalculator;

public class TestCalculator {
	
	//private Calculator calculator;
	
	@Test
	public void emptyStringReturnsZero(){
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add(""),0);
	}
	@Test
	public void singleValueString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("1"),1);
	}
	@Test
	public void twoValueString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("1,2"),3);
	}

}
