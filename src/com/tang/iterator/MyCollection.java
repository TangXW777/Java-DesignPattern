package com.tang.iterator;

public class MyCollection implements Collection{
	String[] collection = {"A", "B", "C", "D", "E"};
	
	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return collection[i];
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return collection.length;
	}

}
