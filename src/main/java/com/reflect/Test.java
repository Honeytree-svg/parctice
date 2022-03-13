package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] s) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Class clz = null;
        try {
            clz = Class.forName("com.reflect.Book");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //获取所有的构造函数
        Constructor[] constructors = clz.getDeclaredConstructors();
        //获取单个所有的构造函数
        try {
            Constructor constructor =
                    clz.getDeclaredConstructor(String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //获取所有的公开构造函数
        Constructor[] constructors1 = clz.getConstructors();
        //获取单个公开构造函数
        try {
            Constructor constructor = clz.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Method[] methods = clz.getMethods();    //获取所有的公开方法
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method method = clz.getMethod("printAll");        //获取单个的公开方法
        method.invoke(clz.newInstance(),null);

        //所有
        Field[] declaredFields = clz.getDeclaredFields();   //所有字段
        for (Field tmp:
                declaredFields) {
            System.out.println(tmp.getName());
        }
    }
}
