package com.javabasis;

import java.util.Objects;

public class A extends Construct{

    private String a;
    private String age;

    public A(String str, String a) {
        //super(str);
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return Objects.equals(a, a1.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, age);
    }
}
