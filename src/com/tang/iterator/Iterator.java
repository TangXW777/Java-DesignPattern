package com.tang.iterator;

public interface Iterator {
	// ǰ��
	Object previous();
	// ����
	Object next();
	
	boolean hasNext();
	
	Object first();
}
