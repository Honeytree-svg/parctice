package com.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String []args) throws IOException {

//        BufferedReader a = null;
//        File ss = new File("D://install.log");
//        InputStream in = new FileInputStream(ss);
//        a = new BufferedReader(new InputStreamReader(in));
//
//        System.out.println(a.readLine());
       // BufferedReader


        try {
            FileInputStream fis = new FileInputStream(new File("D://install.log"));
            FileOutputStream fos = new FileOutputStream(new File("D://install"));
            BufferedInputStream bis = new BufferedInputStream(fis);

            BufferedReader sdf = new BufferedReader(new FileReader(new File("ss")));
            FileReader safa = new FileReader(new File("ss"));


            byte[] arr = new byte[1024];
            int length ;
            while((length = bis.read(arr)) !=-1){

                fos.write(arr,0,length);
            }

            fos.close();
            fis.close();
            bis.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sdsdf"));
            Object o = ois.readObject();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sdfs"));
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }


        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("ss")),"utf-8");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("a")),"utf-8");

        isr.getEncoding();

    }

    @org.junit.Test
    public void load() throws IOException {

        RandomAccessFile raf = new RandomAccessFile("sdfs","r");
        int length = (int) raf.length();
        int firstSegment = 0;
        int secondSegment = length/4;
        int thirdSegment = secondSegment*2;
        int forthSegment = secondSegment*3;

        FileLoadThread th1 = new FileLoadThread();
        th1.setIndex(firstSegment);
        th1.setRaf(raf);
        th1.setSb(new StringBuffer());

        FileLoadThread th2 = new FileLoadThread();
        th1.setIndex(secondSegment);
        th1.setRaf(raf);
        th1.setSb(new StringBuffer());

        FileLoadThread th3 = new FileLoadThread();
        th1.setIndex(thirdSegment);
        th1.setRaf(raf);
        th1.setSb(new StringBuffer());

        FileLoadThread th4 = new FileLoadThread();
        th1.setIndex(forthSegment);
        th1.setRaf(raf);
        th1.setSb(new StringBuffer());

        System.out.println("ss");
    }

    @org.junit.Test
    public void test2(){

        Path path = Paths.get("D://install.log");
        System.out.println(path);
    }
}

class FileLoadThread extends Thread{

    private int index;
    private int last;
    private RandomAccessFile raf;
    private StringBuffer sb = new StringBuffer();
    @Override
    public void run() {

        int length;
        byte[] buffer = new byte[8];
        try {
            raf.seek(index);
            while( (length = raf.read(buffer)) != -1){

                sb.append(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public RandomAccessFile getRaf() {
        return raf;
    }

    public void setRaf(RandomAccessFile raf) {
        this.raf = raf;
    }

    public StringBuffer getSb() {
        return sb;
    }

    public void setSb(StringBuffer sb) {
        this.sb = sb;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
}
