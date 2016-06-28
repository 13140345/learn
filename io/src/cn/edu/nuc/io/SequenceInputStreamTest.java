package cn.edu.nuc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in1 = new FileInputStream("d:/home/in1.txt");
		FileInputStream in2 = new FileInputStream("d:/home/in2.txt");
		
		FileOutputStream out = new FileOutputStream("d:/home/out.txt");
		
		SequenceInputStream sis = new SequenceInputStream(in1, in2);
		
		byte [] buf = new byte[512];
		int len;
		while( (len = sis.read(buf)) != -1 ){
			
			out.write(buf, 0, len);
		}
		in1.close();
		in2.close();
		sis.close();
		out.close();
		
	}

}
