package com.ochoscar.threads;

public class SyncThread {
	
	private static int data = 0;
	
	public static void main(String[] args) {
		new Thread(() -> job(1)).start();
		new Thread(() -> job(2)).start();
		new Thread(() -> job(3)).start();
	}
	
	public synchronized static void job(int id) {
		for(int i = 0; i < 100; i++) {
			System.out.println("job " + id + ": " + data++);
		}
	}
	

}
