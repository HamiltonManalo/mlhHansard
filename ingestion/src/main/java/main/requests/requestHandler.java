package main.requests;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class requestHandler {
    public requestHandler() {}


    String direct = System.getProperty("user.dir") + "\\extracted";
    public InputStream getZip(String Url) throws IOException {

        InputStream stream = null;

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://api.data.parliament.uk/resources/files/998490.zip");

        CloseableHttpResponse response = httpClient.execute(httpGet);

        try {
            stream = response.getEntity().getContent();
            extractFiles(stream);
            stream.close();

        } catch(Exception E) {
            E.printStackTrace();
        } finally {
            response.close();
        }
        return stream;
    }

    public void extractFiles(InputStream dataStream) throws IOException {
        ArrayList<ArrayList<Byte>> fileList = new ArrayList<ArrayList<Byte>>();
        File directory = new File(direct);
        if(!directory.exists())
            directory.mkdir();
        ZipInputStream zis = new ZipInputStream(dataStream);
        ZipEntry zipEntry = zis.getNextEntry();

        byte[] buffer = new byte[1024];

        while (zipEntry != null) {
            ArrayList<Byte> file = new ArrayList<>();
            if(zipEntry.getName().toLowerCase().contains("xml")) {
                int len = 0;
                while((len = zis.read(buffer)) > 0) {
                    file.addAll(buffer);
                }
            }

//            File newFile = new File(direct, zipEntry.getName());
//            FileOutputStream fos = new FileOutputStream(newFile);
//            int len;
//            while ((len = zis.read(buffer)) > 0) {
//                fos.write(buffer, 0, len);
            }
//            fos.close();
//            zipEntry = zis.getNextEntry();
//        }
        zis.closeEntry();
        zis.close();

    }
//
//    public void getNestedFiles(File directory) throws IOException {
//        ArrayList<File> xmlFiles = new ArrayList<>();
//        File[] fileList = directory.listFiles();
//        for(File x : fileList) {
//            if(x.isDirectory()) {
//                getNestedFiles(x);
//            } else if(x.getName().toLowerCase().contains("zip")) {
//                FileInputStream fis = new FileInputStream(x);
//                ZipInputStream zis = new ZipInputStream(fis);
//
//            }
//        }
//    }

}
