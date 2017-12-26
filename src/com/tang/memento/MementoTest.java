package com.tang.memento;

/**
 * ����¼ģʽ Memento
 * ������ԭʼ��A��A���и������ԣ�A���Ծ�����Ҫ���ݵ����ԣ�
 * ����¼��B�������洢A��һЩ�ڲ�״̬����C�أ�����һ�������洢����¼�ģ���ֻ�ܴ洢�������޸ĵȲ���
 * @author TangXW
 *
 */
public class MementoTest {
	public static void main(String[] args) {
		// ԭʼ����
		Original original = new Original("tang");
		// ��������¼
		Storage storage = new Storage(original.createMemento());
		
		// ��ӡԭʼ��¼
		System.out.println("��ʼ��״̬Ϊ��" + original.getValue());  
		original.setValue("xw");  
        System.out.println("�޸ĺ��״̬Ϊ��" + original.getValue());  
        
        // �ָ�����
        original.restoreMemento(storage.getMemento());
        System.out.println("�ָ����״̬Ϊ�� " + original.getValue());
	}
}
