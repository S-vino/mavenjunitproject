package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class AddTest {
	static int add(int a,int b) {
	return a+b;
	}
	
	@Test
	public void testAdd() {
		assertEquals(4, add(2,2));

	}
		
}
