package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorAdditionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldAddTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doOperation(3, 5, Operator.ADDITION) == 8);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doOperation(3, 0, Operator.ADDITION) == 3);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.doOperation(0, 0, Operator.ADDITION) == 0);
	}

}
