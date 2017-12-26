package com.tang.strategy;

public class Minus extends AbstractCalculator implements ICalculator{
	@Override
	public int calculate(String exp) {
		int[] array = split(exp, "\\-");
		return array[0] - array[1];
	}

}
