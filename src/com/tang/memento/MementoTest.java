package com.tang.memento;

/**
 * 备忘录模式 Memento
 * 假设有原始类A，A中有各种属性，A可以决定需要备份的属性，
 * 备忘录类B是用来存储A的一些内部状态，类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作
 * @author TangXW
 *
 */
public class MementoTest {
	public static void main(String[] args) {
		// 原始数据
		Original original = new Original("tang");
		// 创建备忘录
		Storage storage = new Storage(original.createMemento());
		
		// 打印原始记录
		System.out.println("初始化状态为：" + original.getValue());  
		original.setValue("xw");  
        System.out.println("修改后的状态为：" + original.getValue());  
        
        // 恢复备份
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为： " + original.getValue());
	}
}
