package com.tang.observer;

/**
 * 发布者
 * @author TangXW
 *
 */
public interface Subject {
	/* 增加 */
	void add(Observer observer);
	
	/* 移除 */
	void remove(Observer observer);
	
	/* 通知订阅者 */
	void notifyObservers();
	
	/* 自身更新 */
	void operation();
}
