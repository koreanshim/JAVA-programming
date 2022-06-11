package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        byte[] data = "dlwlra".getBytes();
        os.write(data);
        os.flush();
        os.close();
    }
}
