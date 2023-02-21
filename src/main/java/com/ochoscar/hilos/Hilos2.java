package hilos;

public class Hilos2 {
	
	public static int suma = 0;

	public static void main(String[] args) {
		Hilo hilo = new Hilo();
		hilo.start();
		synchronized (hilo) {
			try {
				hilo.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println(suma);
	}
	
}

class Hilo extends Thread {
	
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 100; i++) {
				Hilos2.suma += i;
			}
			notify();
		}
	}
	
}
