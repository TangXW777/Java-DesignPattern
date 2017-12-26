package com.tang.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式 Builder，和工厂模式区别就是实例不同的接口实现类
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
