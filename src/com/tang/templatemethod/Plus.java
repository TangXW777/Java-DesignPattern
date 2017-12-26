package com.tang.templatemethod;

/**
 * 模板方法方式 Template Method
 * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，
 * 也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，
 * 通过调用抽象类，实现对子类的调用
 * @author TangXW
 *
 */
public class Plus extends AbstractCalculator{

	@Override
	int calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		AbstractCalculator calculator = new Plus();
		System.out.println(calculator.calculte("1+2", "\\+"));
	}

}
