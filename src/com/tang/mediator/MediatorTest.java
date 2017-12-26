package com.tang.mediator;

/**
 * 中介者模式 Mediator
 * 如果使用中介者模式，只需关心和Mediator类的关系，
 * 具体类类之间的关系及调度交给Mediator就行，这有点像spring容器的作用
 * @author TangXW
 *
 */
public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
