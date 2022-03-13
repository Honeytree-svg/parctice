package com.javabasis;

import java.io.ObjectInputStream;

public class ForName {

    public static void main(String[]s) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("com.javabasis.B");
        B a = (B) aClass.newInstance();
        a.setA("AA");

    }
}
