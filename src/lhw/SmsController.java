package lhw;

import java.util.List;

/**
 * ���ŷ���controller
 * @author TangXW
 *
 */
public class SmsController {
	private SmsService smsService;
	
	
	/**
	 * ǰ̨���÷��Ͷ���
	 */
	public void sendSms(){
		List<Sms> list = null; // ��ѯ������ȫ�����ţ�����ģ��һ��
		
		/* ��10���߳�ȥ������������ */
		SendSmsTool.sendSms(smsService, list, 10);
	}
}
