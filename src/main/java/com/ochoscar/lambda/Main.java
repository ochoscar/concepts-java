package com.ochoscar.lambda;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.ochoscar.entity.Person;

strictfp public class Main {

	public static void main(String... args) {
		Stream.iterate(2, x -> x + 1).limit(20).filter(x -> !Stream.iterate(2, n -> n + 1).limit(x - 2).anyMatch(t -> x % t == 0)).forEach(System.out::println);

	}

	strictfp public static void main2(String[] args) {
		String str = "hola mundo";
		char ch = 'a';
		CharSequence cs = "adsf";
		str.replace("ol", "z");
		
		//Person p = new Person();
		List<String> list = Arrays.asList("Z", "E", "T", "R", "W", "B", "K", "L");
		Comparator<String> minor = (String a, String b) -> a.compareTo(b) > 0;
		Comparator<String> mayor = (a, b) -> {
			return a.compareTo(b) < 0;
		};
		Predicate<String> p = s -> "ROJO".equals(s);
		
		
		Supplier<String> ns2 = () -> new String();
		Supplier<String> ns = String::new;
		String cad = "";
		
		Function<String, String> fs = String::toUpperCase;
		String tt = "";
		Function<String, String> fs2 = tt::concat;
		
		
		System.out.println(list);
		//Main.<String>sort(list, minor);

		//Main.<String>sort(list, minor, System.out::println);
		Consumer<List<String>> cons = (a) -> System.out.println(a);
		Main.<String>sort(list, minor, cons);
		//Main.<String>sort(list, (a, b) -> a.compareTo(b) < 0);
		System.out.println(list);
		
		// Stream
		createStream();
		 ops();
		
		
		// Lista negra
		listaNegra();


		// Mas de lambda

		Function<Integer,  List> listSupplier = (num) -> new  ArrayList(num);
		List lista2 = listSupplier.apply(5);
		Comparable<String> c = (r) -> "hola".compareTo(r);

		//metodo(() -> 42);
		List<String> lista  = new ArrayList<>();
		Predicate<String>  p2 = s -> lista.add(s);
		//	System.out.println("hi!");};
		boolean res = p2.test("hola");
		System.out.println("****** " + res);
		Consumer<String>  c2 = s -> lista.add(s);
	}

	public static void metodo(Callable<Integer> p)
	{

	}
	public static void metodo(PrivilegedAction<Integer> c)
	{

	}

	public static void ops() {
		Stream<String> s1 = Stream.of("sandra", "manuel", "oscar", "uriel");
		
		System.out.println("TEST");
		s1.map(Person::new).forEach(System.out::println);;
		
		//s1.distinct().filter( s -> s.startsWith("o") ).map(String::toUpperCase).forEach(System.out::println);
		//Optional<String> str = s1.distinct().filter( s -> s.startsWith("o") ).map(String::toUpperCase).max(String::compareToIgnoreCase);
		//Optional<String> str = s1.distinct().map(String::toUpperCase).max(String::compareToIgnoreCase);
		//System.out.println(str.get());
		//long c = s1.distinct().map(String::toUpperCase).collect(Collectors.counting());
		//String s = s1.distinct().map(String::toUpperCase).collect(Collectors.joining(" "));
		//List<String> sl = s1.distinct().map(String::toUpperCase).collect(Collectors.toList());
		
		
		Stream s4 = Stream.iterate(2, x -> x + 2);
		s4.skip(10).limit(20).forEach(System.out::println);
		
		
	}
	
	public static void createStream() {
		List<String> list = Arrays.asList("Z", "E", "T", "R", "W", "B", "K", "L");
		int ints[] = {4, 6, 7, 8};
		
		Stream s1 = Stream.of("a", "b", "c", "d");
		Stream s2 = list.stream();
		IntStream s3 = Arrays.stream(ints);
		// Stream infinito
		Stream s4 = Stream.iterate(2, x -> x + 2);
		// Stream builder
		Stream.Builder<String> sb = Stream.builder();
		sb.accept("a");
		sb.accept("b");
		sb.accept("c");
		Stream s5 = sb.build();
	}
	
	public static void listaNegra() {
		System.out.println("lista negra");
		String ms[] = {"ochoscar@gmail.com", "oaochoa@udem.edu.co", "oscarochoa@pol.com.co", "oaochoa@udem.edu.co", "oaochoa@udem.edu.co"};
		List<String> mails = new ArrayList<String>(Arrays.asList(ms));
		String blacklist = "test@gmail.com, oaochoa@udem.edu.co";
		//mails.removeIf(s -> blacklist.contains(s));
		
		List<String> newList = mails.stream().filter(s -> !blacklist.contains(s)).collect(Collectors.toList());
		//List<String> newList2 = mails.stream().allMatch(s -> !blacklist.contains(s));
		
//		for(String m : mails) {
//			if(blacklist.contains(m)) {
//				mails.remove(m);
//			}
//		}
		
//		for(int i = 0; i < mails.size(); i++) {
//			if(blacklist.contains(mails.get(i))) {
//				mails.remove(i);
//			}
//		}
		
		System.out.println(newList);	
	}
	
	public static <T extends Comparable<T>> void sort(List<T> list, Comparator<T> c, Consumer<List<T>> cons) {
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = 0; j < list.size() - 1; j++) {
				if(c.op(list.get(j), list.get(j + 1))) {
					T temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
			cons.accept(list);
		}
	}
	
	
}
