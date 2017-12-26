package lhw;

import java.util.List;

/**
 * 短信发送controller
 * @author TangXW
 *
 */
public class SmsController {
	private SmsService smsService;
	
	
	/**
	 * 前台调用发送短信
	 */
	public void sendSms(){
		List<Sms> list = null; // 查询出来的全部短信，这里模拟一下
		
		/* 开10个线程去发送这批短信 */
		SendSmsTool.sendSms(smsService, list, 10);
	}
}
