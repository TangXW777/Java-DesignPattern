package com.tang.abstractfactory;

public class SendMailProvider implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}
	
}
