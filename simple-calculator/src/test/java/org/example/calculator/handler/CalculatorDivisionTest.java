package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorDivisionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldDivideTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doOperation(15, 5, Operator.DIVISION) == 3);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doOperation(0, 6, Operator.DIVISION) == 0);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.doOperation(10, -2, Operator.DIVISION) == -5);
	}

}
