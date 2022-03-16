package com.nio;

import java.nio.IntBuffer;

public class BasicBuffer {

    public static void main(String[] args) {

        // 举例说明Buffer的使用
        //创建一个buffer
        IntBuffer intbuff = IntBuffer.allocate(5);

        intbuff.put(10);
        intbuff.put(10);
        intbuff.put(10);
        intbuff.put(10);
        intbuff.put(10);

        // 将buffer转换，读写切换
        intbuff.flip();

        while(intbuff.hasRemaining()){

            System.out.println(intbuff.get());
        }
    }
}
