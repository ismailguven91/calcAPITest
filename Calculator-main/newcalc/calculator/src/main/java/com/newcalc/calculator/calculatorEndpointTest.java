package com.newcalc.calculator;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class calculatorEndpointTest {

	private String sut;

	@Before
	public void setUp() throws Exception {
		sut = "http://localhost:8080";
	}

	@Test
	public void testAdd() throws IOException {
		

		String testData1 = "5.0";
		String testData2 = "5.0";

		String expected =  "10.0";
		String notExpected = expected + " not match";

		
		String url = sut + "/add";
		String params = "?number1=" + testData1+"&"+"number2="+testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	
	@Test
	public void testSub() throws IOException {
		

		String testData1 = "5.0";
		String testData2 = "5.0";

		String expected =  "0.0";
		String notExpected = expected + " not match";

		String url = sut + "/sub";
		String params = "?number1=" + testData1+"&"+"number2="+testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	@Test
	public void testMulti() throws IOException {
		

		String testData1 = "5.0";
		String testData2 = "5.0";

		String expected =  "25.0";
		String notExpected = expected + " not match";

		String url = sut + "/multi";
		String params = "?number1=" + testData1+"&"+"number2="+testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	@Test
	public void testDiv() throws IOException {
		

		String testData1 = "5.0";
		String testData2 = "5.0";

		String expected =  "1.0";
		String notExpected = expected + " not match";

		String url = sut + "/div";
		String params = "?number1=" + testData1+"&"+"number2="+testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
}
