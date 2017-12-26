package com.tang.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式 Prototype
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @author TangXW
 *
 */
public class PrototypeTest implements Cloneable, Serializable{
	private int num;  // 基本类型，浅复制也会重新也会重新创建
	private String[] strings;  // 引用类型，浅复制不会重新创建，只是引用，但是深复制就会重新创建

	public PrototypeTest(int num, String[] strings) {
		super();
		this.num = num;
		this.strings = strings;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String[] getStrings() {
		return strings;
	}
	public void setStrings(String[] strings) {
		this.strings = strings;
	}


	
	/**
	 * 浅复制
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeTest pt = (PrototypeTest)super.clone();
		return pt;
	} 

	
	/**
	 * 深复制
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		// 放入流
		ByteArrayOutputStream bt = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bt);
		oo.writeObject(this);
		
		// 从流中读出对象
		ByteArrayInputStream bi = new ByteArrayInputStream(bt.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return oi.readObject();

	}
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		PrototypeTest p1 = new PrototypeTest(23, new String[]{"Hello","World"});
		// PrototypeTest p2 = (PrototypeTest) p1.clone();
		PrototypeTest p2 = (PrototypeTest) p1.deepClone();
		/* 可以发现浅复制时strings的hashcode是一样的，而深复制的时候不同 */
		System.out.println("p1.strings = " + p1.strings.hashCode() + ", p2.strings = " + p2.strings.hashCode());
	}
	
}
