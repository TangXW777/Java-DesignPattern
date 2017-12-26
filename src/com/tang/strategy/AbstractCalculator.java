package com.tang.strategy;

public class AbstractCalculator {
	public int[] split(String exp, String regex){
		String[] array = exp.split(regex);
		int[] intarray = new int[2];
		intarray[0] = Integer.parseInt(array[0]);
		intarray[1] = Integer.parseInt(array[1]);
		return intarray;
		
	}
}
