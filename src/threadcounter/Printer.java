/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcounter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Printer implements Runnable{

    @Override
    public void run() {
        while(true) {

            try {
                ThreadCounter.semaphoreA.acquire();
                System.out.println("La varibile è: "+ThreadCounter.count);
            } catch (InterruptedException ex) {
                Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
            }
            ThreadCounter.semaphoreB.release();
        }
    }
    
    
}
