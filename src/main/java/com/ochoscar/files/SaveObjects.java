package com.ochoscar.files;

import java.io.*;

public class SaveObjects {

    public static final String file = "/Users/ochoscar/Desktop/test.txt";

    public static void main(String[] args) {
        // lectura escritura basica
        write();
        read();
        // Escribir al final

        // Leer por linea

        // Lectura escritura objeto
    }

    public static void read() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Clase obj = (Clase)ois.readObject();

            System.out.println("resultado: " + obj);
            fis.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write() {
        //FileOutputStream fos = null;
        Clase c = new Clase();
        c.setId(3L);
        c.setName("oscar");

        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Clase implements Serializable {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
