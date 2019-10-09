/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcounter;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class ThreadCounter {

    /**
     * @param args the command line arguments
     */
    
    public static int count=0;
    static Semaphore semaphoreA=new Semaphore(0);
    static Semaphore semaphoreB=new Semaphore(1);
    public static void main(String[] args) 
    {
        Thread counter=new Thread(new Counter());
        Thread printer=new Thread(new Printer());
        counter.start();
        printer.start();
        
    }
    
}
