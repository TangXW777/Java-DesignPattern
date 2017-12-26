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
public class Counter2 implements Runnable {

	public void run() {
		while (true) {
			synchronized (Counter.flag) {
				while (Counter.i <= 10) {
					try {
						if (Counter.i % 2 == 0) {
							System.out.println(Counter.i);
							Counter.i++;

						} else {
							Counter.flag.notifyAll();
							Counter.flag.wait();
						}

					} catch (InterruptedException ex) {
						Logger.getLogger(Counter2.class.getName()).log(
								Level.SEVERE, null, ex);
					}
				}
			}
		}

	}

}