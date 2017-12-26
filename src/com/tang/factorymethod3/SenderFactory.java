package com.tang.factorymethod3;


/**
 * 静态多个工厂方法 
 * 工厂方法不需要创建实例
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
