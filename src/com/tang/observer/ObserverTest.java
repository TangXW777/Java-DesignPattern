package com.tang.observer;
/**
 * �۲���ģʽ Observer
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯
 * @author TangXW
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.operation();
	}
}
