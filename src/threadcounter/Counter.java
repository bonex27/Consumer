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
public class Counter implements Runnable{

    @Override
    public void run() {
        this.write();
        
    }
    public void  write()
    {
        while(true)
            ThreadCounter.count++;
    }
    
}
