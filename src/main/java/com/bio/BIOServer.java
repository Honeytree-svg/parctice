package com.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BIOServer {

    public static void main(String[] args) throws IOException {

        // 1、创建一个线程池
        //2. 如果有客户端链接，就创建一个线程，与之通信
        ExecutorService threadPool = Executors.newCachedThreadPool();

        ServerSocket serverSocket = new ServerSocket(6666);

        System.out.println("server start");

        while(true){

            final Socket socket = serverSocket.accept();

            threadPool.execute(new Runnable() {
                @Override
                public void run() {

                    // 可以和客户端通讯

                }
            });
        }
    }

    // handler方法，和客户端通讯
    public static void handler(Socket socket) throws IOException {

        byte[] bytes = new byte[1024];
        // 通过socket获取输入流
        InputStream is  = socket.getInputStream();

    }
}
