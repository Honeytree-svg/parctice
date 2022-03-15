package com.intel;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://www.bilibili.com/video/BV1Kb411W75N?p=629&spm_id_from=pageDriver");
        url.getProtocol();
        url.getHost();
        url.getPort();
        url.getPath();
        url.getFile();
        url.getQuery();
    }

    @Test
    public void download() throws IOException {

        URL url = new URL("https://www.bilibili.com/video/BV1Kb411W75N?p=629&spm_id_from=pageDriver");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
    
        urlConnection.connect();

        InputStream is = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream(new File("ada.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1){

            fos.write(buffer,0,len);
        }
    }
}
