package cn.edu.nuc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PetTest {

	public static void main(String[] args) throws IOException {
		String name = "多多";
		String type = "企鹅";
		String master = "小明";
		
		FileInputStream fis = new FileInputStream("d:/home/pet.template");
		FileOutputStream fos = new FileOutputStream("d:/home2/duoduo.txt");
		
		byte [] buf = new byte[fis.available()];
		fis.read(buf);
		fis.close();
		String str = new String(buf);
		
		str = str.replace("{name}", name).replace("{type}", type).replace("{master}", master);
		
		fos.write( str.getBytes() );
		fos.close();
		
		System.out.println( str );
	}

}
