package com.tang.factorymehtod1;

/**
 * ��ͨ����ģʽ Factory Method 
 * ��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * 
 * Sender������
 * @author TangXW
 *
 */
public class SenderFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}
		return null;
	}
	
	public static void main(String[] args) {
		SenderFactory sf = new SenderFactory();
		Sender sms = sf.produce("sms");
		sms.send();
	}
}
