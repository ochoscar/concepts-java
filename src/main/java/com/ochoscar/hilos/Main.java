package hilos;

public class Main {
	
	public static void main(String[] args) {
		infinito(0);
	}
	
	public static void infinito(int i) {
		System.out.println(i);
		infinito(i + 1);
	}

}
