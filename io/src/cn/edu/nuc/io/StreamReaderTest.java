package cn.edu.nuc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReaderTest {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/home/pet.template"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/home2/dd2.txt"), "utf-8");
		
		char [] buf = new char[1024 * 2];
		int len = 0;
		while( (len = isr.read(buf)) != -1){
			osw.write(buf, 0, len);
			osw.flush();
		}
		osw.close();
		isr.close();
	}

}
