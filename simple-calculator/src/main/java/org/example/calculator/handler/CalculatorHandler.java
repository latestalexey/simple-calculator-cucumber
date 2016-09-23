package org.example.calculator.handler;

public class CalculatorHandler {

	public int doOperation(int operand1, int operand2, Operator operator) {
		switch (operator) {
		case ADDITION:
			return doAddition(operand1, operand2);
		case SUBTRACTION:
			return doSubtraction(operand1, operand2);
		case MULTIPLICATION:
			return doMultiplication(operand1, operand2);
		case DIVISION:
			return doDivision(operand1, operand2);
		default:
			return 0;
		}
	}
	
	private int doAddition(int operand1, int operand2) {
		return operand1 + operand2;
	}

	private int doSubtraction(int operand1, int operand2) {
		return operand1 - operand2;
	}

	private int doMultiplication(int operand1, int operand2) {
		return operand1 * operand2;
	}

	private int doDivision(int operand1, int operand2) {
		return operand1 / operand2;
	}
}
