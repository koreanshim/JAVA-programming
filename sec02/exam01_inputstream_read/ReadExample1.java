package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Temp\\Temp_for_JAVA");

        int readByte;
        while((readByte = is.read()) != -1) {
            System.out.println((char)readByte);
        }

        is.close();
    }
}
