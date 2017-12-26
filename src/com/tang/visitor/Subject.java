package com.tang.visitor;

public interface Subject {
	void accept(Visitor visitor);
	
	String getSubject();
}
