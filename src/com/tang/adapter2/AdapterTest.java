package com.tang.adapter2;

/**
 * ������ģʽ Adapter
 * ���������������
 * ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ�
 * ��β��̳�Source�࣬���ǳ���Source���ʵ�����Դﵽ��������Ե�����
 * @author TangXW
 *
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		Targetable tt = new Wrapper(new Source());
		tt.method1();
		tt.method2();
	}
}
