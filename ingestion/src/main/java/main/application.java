package main;

import main.requests.requestHandler;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class application {


    public static void main(String[] args) throws Exception {
        try {
            requestHandler x = new requestHandler();
//            System.out.println(System.getProperty("user.dir"));
            x.getZip("");
        } catch(Exception E) {
            E.printStackTrace();
        }
    }
}
