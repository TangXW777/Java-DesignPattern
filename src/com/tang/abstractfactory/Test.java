package com.tang.abstractfactory;

/**
 * ���󹤳�ģʽ  AbstractFactory
 * �ô����ǣ����������������һ�����ܣ�����ʱ��Ϣ��
 * ��ֻ����һ��ʵ���࣬ʵ��Sender�ӿڣ�ͬʱ��һ�������࣬ʵ��Provider�ӿڣ�
 * ��OK�ˣ�����ȥ�Ķ��ֳɵĴ��롣����������չ�ԽϺã�
 * @author TangXW
 *
 */
public class Test {
	public static void main(String[] args) {
		Provider provider = new SendSmsProvider();
		Sender sender = provider.produce();
		sender.send();
	}
}
