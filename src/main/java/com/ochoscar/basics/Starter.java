package com.ochoscar.basics;

public class Starter {

    public static void main(String... args) {
        // Comparar números
        Integer a = 30; // Usar 30000 para a y b
        Integer b = 30;
        Integer c = 30;//new Integer(30);
        System.out.println("Compara números: " + (a == b));
        System.out.println("Compara números: " + (a == c));

        // Comparar strings
        String s1 = "test";
        String s2 = "test";
        String s3 = "test  ";
        String s4 = new String("test");
        System.out.println("Comparar strings: " + (s1 == s2));
        System.out.println("Comparar strings: " + (s1 == s3.trim()));
        System.out.println("Comparar strings: " + (s1 == s4));

        // Promoción
        byte n1 = 2; // Por el pool de enteros para números pequeños
        // n1 = n1 + 2; // Genera error al hacer casting
        // int integer = 12345678901; // Error interpretando un long como int
        //float f1 = 3.4; // Los números con decimal son double
        float f2 = 3.4f;
        float f3 = 3.4F;
        Long i1 = 5L; // Forzar interpretación de int como long

        // Sistemas de numeración
        System.out.println("Misterio: " + 012345);
        System.out.println("Misterio: " + 0b01110 + 0xABC);
    }

}
