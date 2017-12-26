package com.tang.observer;

/**
 * ������
 * @author TangXW
 *
 */
public interface Subject {
	/* ���� */
	void add(Observer observer);
	
	/* �Ƴ� */
	void remove(Observer observer);
	
	/* ֪ͨ������ */
	void notifyObservers();
	
	/* ������� */
	void operation();
}
