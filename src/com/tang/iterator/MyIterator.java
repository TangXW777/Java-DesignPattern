package com.tang.iterator;

public class MyIterator implements Iterator {
	private Collection collection;
	private int index = -1;
	
	
	public MyIterator(Collection collection){
		this.collection = collection;
	}
	
	
	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		if(index > 0){
			index--;
		}
		return collection.get(index);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(index < (collection.size() - 1)){
			index++;
		}
		return collection.get(index);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < (collection.size() - 1)){
			return true;
		}
		return false;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		index = 0;
		return collection.get(0);
	}
	
}
