package com.tang.strategy;

/**
 * ����ģʽ Strategy
 * ����ģʽ�ľ���Ȩ���û���ϵͳ�����ṩ��ͬ�㷨��ʵ�֣���������ɾ���㷨���Ը����㷨����װ��
 * ��ˣ�����ģʽ�������㷨����ϵͳ�У��ⲿ�û�ֻ��Ҫ�������ĸ��㷨���ɡ�
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
