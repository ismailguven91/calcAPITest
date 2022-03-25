package com.newcalc.calculator;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class homeControllerTest {

private homeController sut;
	
	@Before
	public void setUp() {
		sut = new homeController();
	}
	
	@Test
	public void testAddSuccess() throws IOException{
		Double actual = sut.addition(10.0, 10.0);
		Double expected = 20.0;
		String notExpected = expected + " not match";
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}

	@Test
	public void testSubSuccess() throws IOException{
		Double actual = sut.subtraction(10.0, 10.0);
		Double expected = 0.0;
		String notExpected = expected + " not match";
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	
	@Test
	public void testMultiSuccess() throws IOException{
		Double actual = sut.multiplication(10.0, 10.0);
		Double expected = 100.0;
		String notExpected = expected + " not match";
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	
	@Test
	public void testDivSuccess() throws IOException{
		Double actual = sut.division(10.0, 10.0);
		Double expected = 1.0;
		String notExpected = expected + " not match";
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}

}
