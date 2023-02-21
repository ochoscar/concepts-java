package com.ochoscar.sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        try (ServerSocket listener = new ServerSocket(40005)) {
            System.out.println("Servidor corriendo ...");
            while (true) {
                try (Socket socket = listener.accept()) {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println("hola que mas!");

                    Scanner in = new Scanner(socket.getInputStream());
                    System.out.println("Client response: " + in.nextLine());
                }
            }
        }
    }

}




