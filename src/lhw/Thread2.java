package lhw;

public class Thread2 extends Thread{

	@Override
	public void run(){
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(Thread1.flag){
				// TODO Auto-generated method stub
				
				System.out.println("into thread2...");
			}
		}
		
	}
}
