package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorMultiplicationTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldMultiplyTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doOperation(3, 5, Operator.MULTIPLICATION) == 15);
	}

	@Test
	public void shouldMultiplyOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doOperation(3, 0, Operator.MULTIPLICATION) == 0);
	}

	@Test
	public void shouldMultiplyZeroAndZero() {
		assertTrue(calculatorHandler.doOperation(0, 0, Operator.MULTIPLICATION) == 0);
	}

}
