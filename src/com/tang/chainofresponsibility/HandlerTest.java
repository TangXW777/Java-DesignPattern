package com.tang.chainofresponsibility;

/**
 * 责任链模式Chain of Responsibility
 * 有多个对象，每个对象持有对下一个对象的引用，
 * 这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求
 * @author TangXW
 *
 */
public class HandlerTest {
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("handler1");
		MyHandler h2 = new MyHandler("handler2");
		MyHandler h3 = new MyHandler("handler3");
		
		h2.setHandler(h3);
		h1.setHandler(h2);
		
		h1.operator();
	}
}
