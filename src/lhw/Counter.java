/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lhw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Young
 */
public class Counter implements Runnable {
	public static Object flag = new Object();
	public static int i = 1;

	public void run() {
		while (true) {
			synchronized (Counter.flag) {
				while(i <= 10){
				try {
					if (i % 2 != 0) {
						System.out.println(i);
						i++;
					} else {
						flag.notifyAll();
						flag.wait();
					}
				} catch (InterruptedException ex) {
					Logger.getLogger(Counter2.class.getName()).log(
							Level.SEVERE, null, ex);
				}
				}
			}
		}

	}

	public static void main(String[] args) throws InterruptedException{
		Counter c = new Counter();
		Counter2 c1 = new Counter2();
		Counter3 c2 = new Counter3();
		Thread thread = new Thread(c);
		Thread thread1 = new Thread(c1);
		Thread thread2 = new Thread(c2);
		thread2.start();
		thread.start();
		Thread.sleep(100);
		thread1.start();
	}
}
