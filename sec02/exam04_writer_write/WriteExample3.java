package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample3 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test3.txt");
        char[] data = "dlwlrma".toCharArray();
        writer.write(data, 1, 2);
        writer.flush();
        writer.close();
    }
}
