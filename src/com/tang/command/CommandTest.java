package com.tang.command;

/**
 * ����ģʽ Command
 * Invoker�ǵ����ߣ�˾��Ա����Receiver�Ǳ������ߣ�ʿ������MyCommand�����ʵ����Command�ӿ�
 * ����ģʽ��Ŀ�ľ��Ǵﵽ����ķ����ߺ�ִ����֮����ʵ�������ִ�зֿ�
 * @author TangXW
 *
 */
public class CommandTest {
	public static void main(String[] args) {
		// ִ��������
		Receiver receiver = new Receiver();
		// ����
		Command command = new MyCommand(receiver);
		// ������
		Invoker invoker = new Invoker(command);
		
		invoker.action();
	}
}
