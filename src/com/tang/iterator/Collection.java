package com.tang.iterator;

/**
 * ������
 * @author TangXW
 *
 */
public interface Collection {
	Object get(int i);
	
	Iterator iterator();
	
	int size();
	
}
