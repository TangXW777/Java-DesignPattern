package com.tang.factorymethod3;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail sender");
		
	}
	

}
