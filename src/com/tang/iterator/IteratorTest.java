package com.tang.iterator;

/**
 * 迭代子模式 Iterator
 * 迭代器模式就是顺序访问聚集中的对象
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
