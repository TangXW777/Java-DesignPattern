package com.tang.factorymethod2;


/**
 * ����������� 
 * ����ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
 * @author TangXW
 *
 */
public class SenderFactory {

	public Sender produce(){
		return new MailSender();
	}
	
	public Sender getSmsSender(){
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		SenderFactory sf = new SenderFactory();
		Sender sender = sf.getSmsSender();
		sender.send();
	}
}
