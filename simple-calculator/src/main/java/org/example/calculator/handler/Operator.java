package org.example.calculator.handler;

public enum Operator {
	ADDITION("an addition"),
	SUBTRACTION("a subtraction"),
	MULTIPLICATION("a multiplication"),
	DIVISION("a division");
	
	private String desc;
	
	private Operator(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static Operator getByDesc(String desc) {
		for (Operator operator: Operator.values()) {
			if (operator.getDesc().equalsIgnoreCase(desc)) {
				return operator;
			}
		}
			
		return null;
	}
}
