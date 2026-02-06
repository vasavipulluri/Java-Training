package com.ibm.unittesting.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.ibm.unittesting.math.Arithemetic;

public class ArithmeticTest {
	static Arithemetic arithemetic;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arithemetic=new Arithemetic();
		//		System.out.println("Starting the arithemetic class");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Ending the arithemetic class");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Start of the method test");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("End of the method test");
	}

	
	@Test
//	public void test() {
//		int expectedResult=6;
//		Arithemetic arithemetic = new Arithemetic();
//		int actualResult = arithemetic.Sum(2, 4);
//		
//		assertEquals("Comparing results", expectedResult, actualResult);
		
//		fail("Not yet implemented");
	
	
	final void testSum() {
		int  expected=6;
		int actual = arithemetic.Sum(2,4);
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvSource({"2,3,5","-1,1,0","0,0,0","10,-5,5"})
	void testSum(int num1, int num2, int expected) {
		assertEquals(expected, arithemetic.Sum(num1,num2));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,-3,15, Integer.MAX_VALUE})
	void testIsOdd(int number) {
		assertTrue(number % 2 != 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar","level","rotor"})
	void testLength(String text) {
		assertTrue(text.length()==5);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"apple, 5", "banana, 6","'',0","hello IBMer, 11"})
	void testStringLength(String input, int expectedLength) {
		assertEquals(expectedLength, input.length());;
	}

}
