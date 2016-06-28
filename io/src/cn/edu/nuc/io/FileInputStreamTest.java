package cn.edu.nuc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:/home/firebug-2.0.4-fx.xpi");
		FileOutputStream fos = new FileOutputStream("d:/home2/firebug-2.0.4-fx.xpi");
		
		//StringBuilder sb = new StringBuilder();
		long start = System.currentTimeMillis();
		int b = 0;
		byte [] buf = new byte[1024];
		while( (b = fis.read(buf)) != -1){
			//sb.append((char)b);
			fos.write(buf, 0, b);
			fos.flush();
		}
		fos.close();
		fis.close();
		long end = System.currentTimeMillis();
		
		System.out.println( end - start );
		//System.out.println( sb.toString() );
	}

}
