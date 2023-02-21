package hilos;

public class MainThread {

	public static int i = 0;
	public static int j = 0;
	
	public static void main(String[] args) {
		// Forma 1 de hacer un hilo
		Process1 p1 = new Process1();
		p1.start();
		
		for(i = 0; i < 100; i++) {
			System.out.println("Desde hilo main i: " + i + " " + j);
		}
		
		// Forma 2 de hacer un hilo
		new Thread() {
			@Override
			public void run() {
				for(int j = 0; j < 100; j++) {
					System.out.println("Desde hilo process2 j: " + j);
				}
			}
		}.start();
		
		// Forma 3 de hacer un hilo
		new Thread( () ->  {
			for(int j = 0; j < 100; j++) {
				System.out.println("Desde hilo process2 j: " + j);
			}
		}).start();
		
	}
	
}

class Process1 extends Thread {
	
	@Override
	public void run() {
		for(MainThread.j = 0; MainThread.j < 100; MainThread.j++) {
			System.out.println("Desde hilo process1 j: " + MainThread.j);
		}
	}
	
}
