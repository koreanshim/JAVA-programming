package sec02.exam04_writer_write;

import java.io.*;

public class WriteExample4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/text4.txt");
        String data = "dlwlrma wook";
        writer.write(data);
        //writer.write(data, 3, 2);
        writer.flush();
        writer.close();
    }
}
