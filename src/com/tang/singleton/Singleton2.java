package com.tang.singleton;

/**
 * 内部类的单例模式可以保证线程安全
 * @author TangXW
 *
 */
public class Singleton2 {
	private Singleton2(){
		
	}
	
	/**
	 * 内部类实现单例
	 * @author TangXW
	 *
	 */
	private static class SingletonFactory{
		private static Singleton2 instatnce = new Singleton2();
	}
	
	public static Singleton2 getInstance(){
		return SingletonFactory.instatnce;
	}
	
	/**
	 * 反序列化保证单例
	 */
	public Object readResolve(){
		return getInstance();
	}
	
	public static void main(String[] args) {
		Thread ts[] =  new Thread[10];
		for(int i = 0; i < 10; i++){
			ts[i] = new Thread(){
	
				@Override
				public void run() {
					// dosomething
					Singleton2 s = Singleton2.getInstance();
					System.out.println(s.hashCode());
				}	
			};
		}
		
		for(int i = 0; i < 10; i++){
			ts[i].start();
		}
	}
}
