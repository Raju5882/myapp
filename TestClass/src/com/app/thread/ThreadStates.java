package com.app.thread;

public class ThreadStates {

    public static void main(String[] args) throws Exception
    {
        Thread.State[] states = Thread.State.values();
 
        System.out.println(states.length);
        for (Thread.State state : states)
        {
            System.out.println(state);
        }
        System.out.println("----------");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
        Thread t = new Thread();
        //Checking the state before starting the thread
        System.out.println(t.getState());     //Output : NEW
        t.start();
        System.out.println(t.getState());     //Output : NEW
        //Checking the state after starting the thread
   
        Thread.sleep(3000);
       
        System.out.println(t.getState());  //Output : RUNNABLE
        Thread.sleep(3000);
        
       
        System.out.println("hdfkj");
        
    }
    
     void  test() throws Exception
    {
    	
    	synchronized (this) {
			wait(5000);
			
		}
    }
}
