package net.iessanclemente.dapw.katas.stringcalculator.tests;

import static org.junit.Assert.*;
import net.iessanclemente.dapw.katas.stringcalculator.StringCalculator;

import org.junit.Before;
import org.junit.Test;

public class TestStringCalculator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEmptyStringReturnsCero() {
		StringCalculator sc = new StringCalculator();
		int result = sc.add("");
		assertEquals(0,result);
	}

}
