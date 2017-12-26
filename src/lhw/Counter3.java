package lhw;

public class Counter3 implements Runnable{

	@Override
	public void run() {
		System.out.println("into counter3");
		synchronized (Counter.flag) {
			try {
				System.out.println("开始等待");
				Counter.flag.wait();
				System.out.println("取消等待");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
