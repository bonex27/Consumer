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
    
<<<<<<< HEAD
    public static int count=0;
=======
     static int count=0;
>>>>>>> dffe6a10658b0393f178eb513ac34b667d1440a6
    public static void main(String[] args) 
    {
        for(int i=0;i<1000;i++)
        {
        Thread Counter=new Thread(new Counter());
        //Thread Printer=new Thread(new Printer());
        }

        
        
        //Counter.start();
        //Printer.start();
    }
    
}
