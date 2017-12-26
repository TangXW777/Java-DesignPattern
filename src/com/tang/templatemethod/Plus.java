package com.tang.templatemethod;

/**
 * ģ�巽����ʽ Template Method
 * һ���������У���һ�����������ٶ���1...n�������������ǳ���ģ�
 * Ҳ������ʵ�ʵķ���������һ���࣬�̳иó����࣬��д���󷽷���
 * ͨ�����ó����࣬ʵ�ֶ�����ĵ���
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
