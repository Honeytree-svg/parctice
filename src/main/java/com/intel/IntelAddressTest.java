package com.intel;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntelAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.1.1");
    }
}
