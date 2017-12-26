package com.tang.abstractfactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail sender");
		
	}
	

}
