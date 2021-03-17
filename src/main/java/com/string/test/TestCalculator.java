package com.string.test;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

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
	@Test
	public void multipleValueString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("1,2,3"),6);
	}
	@Test
	public void newlineDelimiterValueString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("1\n2,3"),6);
	}
	@Test
	public void delimiterSpecifiedString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("//;\n2;3"),5);
	}

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void throwsErrorForNegativeNumberString() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negative number: -7");
		StringCalculator calculator = new StringCalculator();
		calculator.Add("-7");
	}
	@Test
	public void throwsErrorForNegativeNumbersString() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negative number: -7,-8,-10");
		StringCalculator calculator = new StringCalculator();
		calculator.Add("9,-7,-8,-10,2");
	}
	
	@Test
	public void numberOfTimesString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.GetCalledCount(),7);
	}
	
	@Test
	public void GreaterNumberSpecifiedString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("1003,1001"),0);
	}
	@Test
	public void acceptsDelimiterArbitaryLengthString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add("//[***]\n1***2***3"),6);
	}
	
}