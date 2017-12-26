package lhw;

import java.util.List;

/**
 * 发送短信工具类
 * @author TangXW
 *
 */
public class SendSmsTool {
	/**
	 * 
	 * @param smsService 发送接口
	 * @param list  全部短信
	 * @param threadnum  线程数
	 */
	public static void sendSms(SmsService smsService, List<Sms> list, int threadnum){
		SmsThread[] smsThreads = new SmsThread[threadnum];
		for(int i = 0; i < threadnum; i++){
			// 这里就是从list截取对应的这个线程需要发送短信的条数
			// 如果开10个线程去发送100条短信，那么就是每个线程10条
			// 算法自己写，这里模拟一下
			List<Sms> list2 = null;
			smsThreads[i] = new SmsThread(smsService, list2);
		}
		
		// 启动线程，发送短信
		for(int i = 0; i < threadnum; i++){
			smsThreads[i].start();
		}
	}
	
}
