package com.tang.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ Prototype
 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
 * ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
 * @author TangXW
 *
 */
public class PrototypeTest implements Cloneable, Serializable{
	private int num;  // �������ͣ�ǳ����Ҳ������Ҳ�����´���
	private String[] strings;  // �������ͣ�ǳ���Ʋ������´�����ֻ�����ã�������ƾͻ����´���

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
	 * ǳ����
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeTest pt = (PrototypeTest)super.clone();
		return pt;
	} 

	
	/**
	 * ���
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		// ������
		ByteArrayOutputStream bt = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bt);
		oo.writeObject(this);
		
		// �����ж�������
		ByteArrayInputStream bi = new ByteArrayInputStream(bt.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return oi.readObject();

	}
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		PrototypeTest p1 = new PrototypeTest(23, new String[]{"Hello","World"});
		// PrototypeTest p2 = (PrototypeTest) p1.clone();
		PrototypeTest p2 = (PrototypeTest) p1.deepClone();
		/* ���Է���ǳ����ʱstrings��hashcode��һ���ģ�����Ƶ�ʱ��ͬ */
		System.out.println("p1.strings = " + p1.strings.hashCode() + ", p2.strings = " + p2.strings.hashCode());
	}
	
}
