package com.tang.mediator;

/**
 * �н���ģʽ Mediator
 * ���ʹ���н���ģʽ��ֻ����ĺ�Mediator��Ĺ�ϵ��
 * ��������֮��Ĺ�ϵ�����Ƚ���Mediator���У����е���spring����������
 * @author TangXW
 *
 */
public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
