package com.tang.interpreter;

/**
 * ������ģʽ Interpreter
 * Context����һ�������Ļ����࣬Plus��Minus�ֱ������������ʵ��
 * @author TangXW
 *
 */
public class Interpreter {
	public static void main(String[] args) {
		// 9 + 2 - 8
		int result = new Minus().interpret((new Context(new Plus()  
        .interpret(new Context(9, 2)), 8)));  
		System.out.println(result);  
	}
}
