package cn.edu.nuc.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("d:/home/print.dat");
		
		PrintStream ps = new PrintStream(os);
		
		System.setOut(ps);
		
		PrintWriter pw = new PrintWriter(System.out);
		
		pw.println("王五");
		pw.flush();
		
		System.out.println("张三,李四");

		pw.close();
	}

}
