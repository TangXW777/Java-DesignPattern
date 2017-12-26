package com.tang.factorymethod3;


/**
 * ��̬����������� 
 * ������������Ҫ����ʵ��
 * @author TangXW
 *
 */
public class SenderFactory {

	public static Sender produce(){
		return new MailSender();
	}
	
	public static Sender getSmsSender(){
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		Sender sender = SenderFactory.getSmsSender();
		sender.send();
	}
}
