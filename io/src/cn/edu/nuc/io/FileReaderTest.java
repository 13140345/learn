package cn.edu.nuc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/home/pet.template");
		FileWriter fw = new FileWriter("d:/home2/dd.txt", true);
		StringBuilder sb = new StringBuilder();
		int len;
		char [] buf = new char[1024 * 2];
		while( (len = fr.read(buf)) != -1 ){
			//System.out.println( (char)c );
			sb.append(buf, 0, len);
			
			fw.write( buf, 0, len );
		}
		fw.close();
		fr.close();
		
		System.out.println( sb.toString() );

	}

}
