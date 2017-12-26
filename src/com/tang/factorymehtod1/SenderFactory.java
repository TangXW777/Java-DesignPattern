package com.tang.factorymehtod1;

/**
 * 普通工厂模式 Factory Method 
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * 
 * Sender工厂类
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
