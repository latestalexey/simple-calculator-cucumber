package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorSubtractionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldSubtractTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doOperation(3, 5, Operator.SUBTRACTION) == -2);
	}

	@Test
	public void shouldSubtractOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doOperation(3, 0, Operator.SUBTRACTION) == 3);
	}

	@Test
	public void shouldSubtractZeroAndZero() {
		assertTrue(calculatorHandler.doOperation(0, 0, Operator.SUBTRACTION) == 0);
	}

}
