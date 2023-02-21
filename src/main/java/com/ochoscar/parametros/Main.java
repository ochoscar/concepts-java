package parametros;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		// Wrappers. Tipos nativps:
		// byte, short, int, long, char, float, double, boolean
		int a1 = 5; // Este no es un objeto
		Integer a2 = Integer.MAX_VALUE; // Este si es un objeto
		boolean b1 = true;
		Boolean b2 = Boolean.FALSE;
		
		//for(char c = 'a'; c <= 'z'; c++) System.out.print(c);
		
		// Ejemplos autoboxin
		ArrayList<Integer> arr = new ArrayList<>(); 
		Integer a3 = 6;
		Integer a4 = new Integer(5);
		arr.add(a3);
		arr.add(a4);
		arr.add(0, null);
		Integer misterio1 = arr.get(0);
		//int misterio2 = arr.get(0);
		//int h = null;
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(1);
		arr2.add(0);
		arr2.remove(1);
		
		int num = 1_000_000;
		double numd = 1_000.00_5;
		
		// Invocacion de metodos
		int im = 1;
		sumar1(2 * im);
		System.out.println(im);
		
		Fruta f = new Fruta();
		sumar2(f);
		System.out.println(f.i);
		
		String s = new String("32");
		sumar3(s);
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("1");
		sumar4(sb);
		System.out.println(sb);
		
		Integer j = 7;
		sumar5(j);
		System.out.println(j);
	}
	
	public static void sumar5(Integer i) {
		i = i + 1;
	}
	
	public static void sumar4(StringBuilder str) {
		str.append("23");
	}
	
	public static void sumar3(String str) {
		str = str + "1";
	}
	
	public static void sumar2(Fruta fp) {
		fp.i++;
	}
	
	public static int sumar1(int a) {
		a = a + 1;
		return a;
	}
	

}
