package com.app.test;

public class ThreadClass {
	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		Thread.sleep(4000);
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		t1.setName("one");
		t2.setName("one");
		System.out.println("count:"+Thread.activeCount());
		System.out.println("priority of t1 :"+t1.getPriority());
		System.out.println("priority of t2 :"+t2.getPriority());
		System.out.println("t1 Is daeon Thread :"+t1.isDaemon());
		System.out.println("t2 Is daeon Thread :"+t2.isDaemon());
		System.out.println("count:"+Thread.activeCount());
		System.out.println("t1 State : "+t1.getState());
		System.out.println("t2 State : "+t2.getState());
		System.out.println("Is t1 Alive :"+t1.isAlive());
		System.out.println("Is t2 Alive :"+t2.isAlive());
		System.out.println(""+t1.MIN_PRIORITY);
		System.out.println(""+t1.MAX_PRIORITY);
		t1.setPriority(1);
		System.out.println(""+t1.getPriority());
		t1.join();
		System.out.println("Is t1 Alive :"+t1.isAlive());
		System.out.println();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}

class Thread2 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}