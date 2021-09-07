package no.kristiania;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


public class HttpClient {
   public static void main(String[] args) throws IOException {
       Socket socket = new Socket("httpbin.org", 80);
       String request = """
               GET /html HTTP/1.1\r
               Host: httpbin.org\r
               \r
               """;

       socket.getOutputStream().write(request.getBytes());

       InputStream in = socket.getInputStream();
       int c;
       while ((c = in.read()) != -1){
           System.out.print((char) c);
       }
   }
}
