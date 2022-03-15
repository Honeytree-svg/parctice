package com.intel;

import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPTest1 {

    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        byte[] buffer = "dsfs".getBytes(StandardCharsets.UTF_8);
        InetAddress address = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length,address,8888);

        socket.send(packet);
    }

    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        socket.receive(packet);

        System.out.println(new String(packet.getData(),0,packet.getLength()));
    }
}
