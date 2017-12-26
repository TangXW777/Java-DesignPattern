package com.tang.interpreter;

/**
 * 解释器模式 Interpreter
 * Context类是一个上下文环境类，Plus和Minus分别是用来计算的实现
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
