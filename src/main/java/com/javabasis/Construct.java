package com.javabasis;

public class Construct {

    public static int count=0;
    private String str;

    public Construct(){

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Construct.count = count;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void say(){
        System.out.println(count);
    }
}
