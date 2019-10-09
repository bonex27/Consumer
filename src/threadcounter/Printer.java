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
public class Printer implements Runnable{

    @Override
    public void run() {
        while(true) {
            System.out.println("La varibile è: "+ThreadCounter.count);
        }
    }
    
    
}
