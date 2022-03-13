package com.javabasis;

import java.io.*;

public class Test {



    public static void main(String[]s) throws IOException, ClassNotFoundException {

//        ObjectOutputStream oos = null;
//        FileOutputStream fos = null;
//
//        B b = new B();
//        b.setA("2");
//        File file = new File("D://file");
//        if (!file.exists()){
//            file.createNewFile();
//        }
//        fos = new FileOutputStream(file);
//        oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(b);
//        oos.close();
//        fos.close();

        ObjectInputStream ois = null;
        FileInputStream fis = null;

        File file = new File("D://file");
        fis = new FileInputStream(file);
        ois = new ObjectInputStream(fis);

        B b = (B) ois.readObject();
        System.out.println(b.getA());
    }

    public static void add(String i){
        i = new String("2");
    }
}
