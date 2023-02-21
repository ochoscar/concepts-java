package com.ochoscar.sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 40005);
        Scanner in = new Scanner(socket.getInputStream());
        System.out.println("Server: " + in.nextLine());
        // Escritura
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("ok");

    }

}



