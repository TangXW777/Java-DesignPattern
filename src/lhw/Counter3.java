package lhw;

public class Counter3 implements Runnable{

	@Override
	public void run() {
		System.out.println("into counter3");
		synchronized (Counter.flag) {
			try {
				System.out.println("��ʼ�ȴ�");
				Counter.flag.wait();
				System.out.println("ȡ���ȴ�");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
