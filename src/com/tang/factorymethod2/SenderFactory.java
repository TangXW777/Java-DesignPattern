package com.tang.factorymethod2;


/**
 * 多个工厂方法 
 * 对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
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
