package io.acaeronte.segundaPrueba;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class HttpServerLight {
    public static void main(String[] args) {
        try {

            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);
            server.createContext("/test", new  MyHttpHandlerLight());
            server.setExecutor(threadPoolExecutor);
            server.start();
            System.out.println("Server started on port 8001");

        }catch (Exception e){

        }
    }
}