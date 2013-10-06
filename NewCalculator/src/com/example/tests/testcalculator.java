package com.example.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalculator {

	@Test
	public void testadd(){
		assertEquals("10+5 must be 15",15,com.example.classes.Calculator.add(10,5));
	}
	@Test
	public void testmul(){
		assertEquals("10*5 must be 50",50,com.example.classes.Calculator.multiply(10,5));
	}
	@Test
	public void testdiv(){
		assertEquals("10/5 must be 2",2,com.example.classes.Calculator.div(10,5));
	}


}
