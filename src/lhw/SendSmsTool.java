package lhw;

import java.util.List;

/**
 * ���Ͷ��Ź�����
 * @author TangXW
 *
 */
public class SendSmsTool {
	/**
	 * 
	 * @param smsService ���ͽӿ�
	 * @param list  ȫ������
	 * @param threadnum  �߳���
	 */
	public static void sendSms(SmsService smsService, List<Sms> list, int threadnum){
		SmsThread[] smsThreads = new SmsThread[threadnum];
		for(int i = 0; i < threadnum; i++){
			// ������Ǵ�list��ȡ��Ӧ������߳���Ҫ���Ͷ��ŵ�����
			// �����10���߳�ȥ����100�����ţ���ô����ÿ���߳�10��
			// �㷨�Լ�д������ģ��һ��
			List<Sms> list2 = null;
			smsThreads[i] = new SmsThread(smsService, list2);
		}
		
		// �����̣߳����Ͷ���
		for(int i = 0; i < threadnum; i++){
			smsThreads[i].start();
		}
	}
	
}
