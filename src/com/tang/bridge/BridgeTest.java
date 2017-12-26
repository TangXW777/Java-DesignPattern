package com.tang.bridge;

/**
 * �Ž�ģʽ Bridge
 * �Ž�ģʽ���ǰ�����������ʵ�ַֿ���ʹ���ǿ��Ը��Զ����ı仯��
 * �Žӵ������ǣ���������ʵ�ֻ����ʹ�ö��߿��Զ����仯�������ǳ��õ�JDBC��DriverManagerһ��
 * @author TangXW
 *
 */
public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		// ���õ�һ������
		bridge.setSource(new SourceSub1());
		bridge.method();
		
		// ���õڶ�������
		bridge.setSource(new SourceSub2());
		bridge.method();
	}
}
