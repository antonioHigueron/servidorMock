package io.acaeronte;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.URI;

public class MyHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        URI uri = exchange.getRequestURI();
        String verb = uri.getPath().replace("/","_");
        StringBuilder sb = new StringBuilder();
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(verb + ".json")){
            if (is != null){
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String str = "";
                while ((str = reader.readLine())!= null){
                    sb.append(str);
                }
            }

        }catch (Exception e){

        }
        OutputStream outputStream = exchange.getResponseBody();
        String htmlResponse = sb.toString();
        exchange.sendResponseHeaders(200,htmlResponse.length());
        outputStream.write(htmlResponse.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
