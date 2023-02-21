package com.ochoscar.threads;

public class Main {
	
	private static Data d = new Data();
	
	public static void main(String[] args) throws Exception {
		/*Thread.sleep(10);
		thread1();
		thread2();*/
		ThreadA.main(null);
	}
	
	public static void thread2() {
		Thread th = new Thread( () -> {
			System.out.println("Procesando hilo 2");
			job("2: ");
		});
		th.start();
	}
	
	// Objeto anonimo
	public static void thread1() {
		// Se puede implementar clase externa heredada
		Thread th = new Thread() {
			
			public void run() {
				System.out.println("Procesando hilo 1");
				job("1: ");
			}
			
		};
		th.start();
	}
	
	public synchronized static void job(String caller) {
		for(int i = 0; i < 100; i++) {
			Main.d.setAmount(Main.d.getAmount() + 1);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(caller + Main.d.getAmount());
		}
	}

}

class ThreadA {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
 
        //synchronized(b){
            //try{
                System.out.println("Waiting for b to complete...");
                //b.wait();
           // }catch(InterruptedException e){
            //    e.printStackTrace();
            //}
 
            System.out.println("Total is: " + b.total);
        //}
    }
}
 
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        //synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            //notify();
			System.out.println("Total is**: " + total);
        //}
    }
}
