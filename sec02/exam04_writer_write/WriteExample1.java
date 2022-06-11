package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test3.txt");
        char[] data = "dlwlrma".toCharArray();
        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]);
        }
        writer.flush();
        writer.close();
    }
}
