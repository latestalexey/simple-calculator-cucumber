package org.example.calculator.cucumber.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.example.calculator.handler.CalculatorHandler;
import org.example.calculator.handler.Operator;

import cucumber.api.DataTable;
import cucumber.api.java8.En;

public class CalculatorSteps implements En {

	private CalculatorHandler calculatorHandler;

	private Integer operand1;
	private Integer operand2;
	private Integer result;

	public CalculatorSteps() {

		Given("^the first operand is (\\d+)$", (Integer operand1) -> {
			this.operand1 = operand1;
		});

		Given("^the second operand is (\\d+)$", (Integer operand2) -> {
			this.operand2 = operand2;
		});

		Given("^the operands:$", (DataTable dataTable) -> {
			List<Map<String, Integer>> rows = dataTable.asMaps(String.class, Integer.class);
			this.operand1 = rows.get(0).get("operand1");
			this.operand2 = rows.get(0).get("operand2");
		});

		When("^I do an? (addition|subtraction|multiplication|division) calculation$", (Operator operator) -> {
			result = calculatorHandler.doOperation(operand1, operand2, operator);
		});

		Then("^the result should be (\\d+)$", (Integer expectedResult) -> {
			assertEquals(expectedResult, result);
		});

		Before(() -> {
			calculatorHandler = new CalculatorHandler();
		});

		After(() -> {
			calculatorHandler = null;
			operand1 = null;
			operand2 = null;
			result = null;
		});
		
	}
}
