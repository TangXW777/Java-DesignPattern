package com.tang.chainofresponsibility;

/**
 * ������ģʽChain of Responsibility
 * �ж������ÿ��������ж���һ����������ã�
 * �����ͻ��γ�һ�������������������ϴ��ݣ�ֱ��ĳһ����������������
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
