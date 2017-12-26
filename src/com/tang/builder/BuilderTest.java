package com.tang.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ Builder���͹���ģʽ�������ʵ����ͬ�Ľӿ�ʵ����
 * @author TangXW
 *
 */
public class BuilderTest {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i = 0; i < count; i++){
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i = 0; i < count; i++){
			list.add(new SmsSender());
		}
	}
	
	public static void main(String[] args) {
		BuilderTest bt = new BuilderTest();
		bt.produceSmsSender(10);
	}
	
}
