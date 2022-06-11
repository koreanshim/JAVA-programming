package sec05.exam02_outputstreamwriter;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "바이트 출력 스트림을 묻자 출력 스트림으로 변환";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일저장이 끝났습니다.");
    }
}
