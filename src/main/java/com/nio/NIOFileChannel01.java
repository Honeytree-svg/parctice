package com.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class NIOFileChannel01 {
    public static void main(String[] args) throws IOException {

        String str = new String("sdfs");
        // 创建一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream(new File("d:\\file01.txt"));
        // 通过 fileOutputStream 获取对应的 FileChannel
        FileChannel fileChannel = fileOutputStream.getChannel();

        // 创建一个缓冲区ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        // 将str 放入byteBuffer
        byteBuffer.put(str.getBytes());
        // 进行flip
        byteBuffer.flip();
        // 将byteBuffer数据写入到fileChannel
        fileChannel.write(byteBuffer);

        fileOutputStream.close();

    }
}
