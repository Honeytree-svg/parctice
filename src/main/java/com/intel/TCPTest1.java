package com.intel;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPTest1 {

    @Test
    public void client() throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),8888);

        OutputStream outputStream = socket.getOutputStream();

        FileInputStream fis = new FileInputStream(new File("aa.jpg"));
        byte[] buffer = new byte[1024];
        int len;

        while((len = fis.read(buffer)) != -1){
            outputStream.write(buffer,0,len);
        }

        socket.shutdownOutput();


        InputStream is = socket.getInputStream();

        byte[] bufferr = new byte[5];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len1;
        while ((len1 = is.read(bufferr)) != -1){

            bos.write(buffer,0,len1);
        }

        System.out.println(bos.toString());
        outputStream.close();
    }

    @Test
    public void server() throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();

        byte[] buffer = new byte[1024];
        FileOutputStream fos = new FileOutputStream(new File("bbb.jpg"));
        int len;
        while ((len = inputStream.read(buffer)) != -1){

            fos.write(buffer,0,len);
        }



    }
}
