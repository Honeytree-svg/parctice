package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {

    public void fileCapy(String src, String dest) {

        FileInputStream fis = null;

        FileOutputStream fos = null;

        try {

            fis = new FileInputStream(new File(src));

            fos = new FileOutputStream(new File(dest));

            byte[] bytes = new byte[1024];

            int length;

            while ((length = fis.read(bytes)) != -1) {

                fos.write(bytes, 0, length);

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (fos != null) {

                try {

                    fos.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

            if (fis != null) {

                try {

                    fis.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        }

    }
}
