package com.tang.decorator;

/**
 * װ����ģʽ Decorator
 * װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�
 * Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * @author TangXW
 *
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Sourceable sc = new Decorator(new Source());
		sc.method();
	}
}
