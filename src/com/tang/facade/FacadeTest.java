package com.tang.facade;

/**
 * ���ģʽ Facade
 * ����Computer�࣬����֮��Ĺ�ϵ��������Computer������������˽��������
 * @author TangXW
 *
 */
public class FacadeTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.startup();
		computer.shutdown();
	}
}
