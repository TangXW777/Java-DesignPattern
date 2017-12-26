package lhw;

import java.util.List;

/**
 * 发送短信线程
 * @author TangXW
 *
 */
public class SmsThread extends Thread {

	private SmsService smsService;
	private List<Sms> list;
	
	public SmsThread(SmsService smsService, List<Sms> list){
		this.smsService = smsService;
		this.list = list;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++){
			// 发送短信
			smsService.sendSms(list.get(i).getContent());
		}
	}

}
