package com.soft863;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFile {

    public static void main(String[] args) throws IOException {
        TestFile testFile = new TestFile();

  /*      String files = "D:\\data\\0test\\a.txt";
        OutputStream outputStream = new FileOutputStream(files);
        outputStream.write("hadoop".getBytes());
        outputStream.write("hadoop1".getBytes());
        outputStream.write("hadoop2".getBytes());
        outputStream.write("hadoop3".getBytes());
        outputStream.close();*/
        String files = "D:\\data\\0test\\a.txt";

        FileInputStream fileInputStream = new FileInputStream(files);
        byte[] bytes = new byte[4096];

        while ((fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }


     /*   String path = "D:\\data\\0test";
        File file = new File(path);*/

    }

    private void find(File file) {
        if (file.isDirectory()) {
            System.out.println("文件夹：" + file);
            File[] fi = file.listFiles();
            for (File item : fi) {
                find(item);
            }
        } else {
            System.out.println(file.getPath());
        }
    }

    private int calc(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return calc(num - 1) + calc(num - 2);
    }
}
