package com.tang.adapter3;

/**
 * ������ģʽ Adapter
 * �����ӿڵ�������
 * ��ʵ�ʿ����У�����Ҳ�����������ֽӿ��ж�����̫��ķ�������������ʱ������һЩʵ�����в����Ƕ���Ҫ
 * @author TangXW
 *
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		Sourceable s1 = new SourceSub1();
		Sourceable s2 = new SourceSub2();
		s1.method1();
		s1.method2();
		s2.method1();
		s2.method2();
	}
}
