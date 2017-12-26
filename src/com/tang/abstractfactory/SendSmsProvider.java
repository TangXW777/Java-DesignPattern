package com.tang.abstractfactory;

public class SendSmsProvider implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	
}
