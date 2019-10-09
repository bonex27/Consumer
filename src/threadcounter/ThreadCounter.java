/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcounter;

/**
 *
 * @author informatica
 */
public class ThreadCounter {

    /**
     * @param args the command line arguments
     */
    
    public static int count=0;
    public static void main(String[] args) 
    {
        Thread Counter=new Thread(new Counter());
        Thread Printer=new Thread(new Printer());
        Counter.start();
        Printer.start();
        
    }
    
}
