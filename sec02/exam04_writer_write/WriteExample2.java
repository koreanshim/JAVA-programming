package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/text3.txt");
        char[] data = "dlwrma".toCharArray();
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
