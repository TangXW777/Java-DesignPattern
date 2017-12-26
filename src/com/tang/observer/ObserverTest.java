package com.tang.observer;
/**
 * 观察者模式 Observer
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化
 * @author TangXW
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.operation();
	}
}
