package com.tang.singleton;

import java.util.Date;

/**
 * 单例模式  Singleton
 * 最简单的单例模式
 * 这样的单例在多线程下是线程不安全的。
 * @author TangXW
 *
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1(){
		
	}
	
	// 唯一实例对象方法
	public static Singleton1 getInstance(){

		if(instance == null){
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){
				
			}
			instance = new Singleton1();
		}
		
		return instance;
	}
	
	public static void main(String[] args) throws InterruptedException{
		Thread ts[] =  new Thread[10];
		for(int i = 0; i < 10; i++){
			ts[i] = new Thread(){
	
				@Override
				public void run() {
					// dosomething
					Singleton1 s = Singleton1.getInstance();
					System.out.println(s.hashCode());
				}	
			};
		}
		
		for(int i = 0; i < 10; i++){
			ts[i].start();
		}

	}
}
