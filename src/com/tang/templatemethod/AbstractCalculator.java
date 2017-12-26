package com.tang.templatemethod;

public abstract class AbstractCalculator {
	public final int calculte(String exp, String regex){
		int[] array = split(exp, regex);
		return calculate(array[0], array[1]);
	}
	
	abstract int calculate(int num1, int num2);
	
	public int[] split(String exp, String regex){
		String[] array = exp.split(regex);
		int[] intarray = new int[2];
		intarray[0] = Integer.parseInt(array[0]);
		intarray[1] = Integer.parseInt(array[1]);
		return intarray;
	}
}
