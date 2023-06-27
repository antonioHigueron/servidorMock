package io.acaeronte;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Servidor {
    public static void main(String[] args) {
        //System.out.println("Hello world nombre: "+ args[0] );
        String context = "/"+ args[0];
        try {
            ThreadPoolExecutor x = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost",8001),0);
            server.createContext(context,new MyHttpHandler());
            server.setExecutor(x);
            server.start();
            System.out.println("Server started on port 8001");
        }catch (Exception e){

        }
    }
}