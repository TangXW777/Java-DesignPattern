package com.tang.iterator;

/**
 * ������ģʽ Iterator
 * ������ģʽ����˳����ʾۼ��еĶ���
 * @author TangXW
 *
 */
public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			Object o = iterator.next();
			System.out.println(o);
		}
	}
}
