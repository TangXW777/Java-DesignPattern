package com.tang.visitor;

/**
 * ������ģʽ Visitor
 * ������ģʽ����һ�ַ���������ݽṹ����Ϊ�ķ�����
 * ͨ�����ַ��룬�ɴﵽΪһ���������߶�̬����µĲ������������������޸ĵ�Ч��
 * @author TangXW
 *
 */
public class VisitorTest {
	public static void main(String[] args) {
		Visitor v = new MyVisitor();
		Subject s = new MySubject();
		s.accept(v);
	}
}
