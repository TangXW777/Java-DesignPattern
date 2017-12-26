package com.tang.strategy;

/**
 * 策略模式 Strategy
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
 * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 * @author TangXW
 *
 */
public class Strategy {
	public static void main(String[] args) {
		ICalculator plus = new Plus();
		ICalculator multiply = new Multiply();
		System.out.println(plus.calculate("1+2"));
		System.out.println(multiply.calculate("2*3"));
	}
}
