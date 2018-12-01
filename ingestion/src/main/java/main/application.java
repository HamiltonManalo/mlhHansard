package main;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class application {


    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://api.data.parliament.uk/resources/files/998490.zip");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        try {
            response.getEntity().getContent();
        } catch(Exception E) {

        } finally {
            response.close();
        }
    }
}
