package cn.edu.nuc.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		File f = new File("d:/home2/test.txt");
		
		FileOutputStream fos = new FileOutputStream( f );
		
		String str = "你要好好学习java";
		
		byte [] words = str.getBytes();
		
		for(byte b : words ){
			
			System.out.print( Integer.toHexString(b & 0xff) + "  " );
		}
		System.out.println();
		System.out.println("len=" + words.length);
		
		fos.write(words);
		fos.close();
		

	}

}
