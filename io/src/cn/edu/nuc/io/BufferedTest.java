package cn.edu.nuc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:/home/pet.template"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:/home2/dd.txt", true));
		
		String line;
		while( (line = br.readLine()) != null ){
			System.out.println( line);
			bw.append(line);
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
