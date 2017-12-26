package lhw;

public class Thread1 extends Thread{
	public static boolean flag = false;

	@Override
	public void run(){
		// TODO Auto-generated method stub
		System.out.println("into thread1...");
		System.out.println("thread1 start sleep...");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){}
		
		flag = true;
		notifyAll();
		System.out.println("change flag to true...");
	}
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
