package com.tang.adapter1;

/**
 * ������ģʽ Adapter
 * һ�����������
 * ����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬
 * Ŀ��ӿ�ʱTargetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * @author TangXW
 *
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		Targetable tt = new Adapter();
		tt.method1();
		tt.method2();
	}
}
