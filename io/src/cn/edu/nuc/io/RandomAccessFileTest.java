package cn.edu.nuc.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		/*Emp e1 = new Emp("zhangsan", 18);
		Emp e2 = new Emp("lisi1234", 20);
		Emp e3 = new Emp("wangwu12", 30);
		
		RandomAccessFile raf = new RandomAccessFile("d:/home/emp.dat", "rw");
		System.out.println("------------1-----------------");
		System.out.println( "-->" + raf.getFilePointer() );
		raf.write( e1.getName().getBytes() );
		System.out.println( "-->" + raf.getFilePointer() );
		//raf.writeInt( e1.getAge() );
		raf.write(e1.getAge() >>> 24);
		raf.write(e1.getAge() >>> 16);
		raf.write(e1.getAge() >>> 8);
		raf.write(e1.getAge() >>> 0);
		System.out.println( "-->" + raf.getFilePointer() );
		System.out.println("------------2-----------------");
		System.out.println( "-->" + raf.getFilePointer() );
		raf.write( e2.getName().getBytes() );
		System.out.println( "-->" + raf.getFilePointer() );
		raf.writeInt( e2.getAge() );
		System.out.println( "-->" + raf.getFilePointer() );
		System.out.println("------------3-----------------");
		System.out.println( "-->" + raf.getFilePointer() );
		raf.write( e3.getName().getBytes() );
		System.out.println( "-->" + raf.getFilePointer() );
		raf.writeInt( e3.getAge() );
		System.out.println( "-->" + raf.getFilePointer() );*/
		
		
		RandomAccessFile raf = new RandomAccessFile("d:/home/emp.dat", "r");
		raf.seek(12);
		System.out.println(raf.getFilePointer());
		
		Emp e1 = new Emp();
		byte [] buf = new byte[8];
		int len = raf.read(buf, 0, 8);
		e1.setName( new String(buf) );
		e1.setAge( raf.readInt() );
		
		System.out.println("第二位员工:" + e1 );
		
		raf.seek(0);
		Emp e2 = new Emp();
		raf.read(buf, 0, 8);
		e2.setName( new String(buf) );
		e2.setAge( raf.readInt() );
		
		System.out.println( "第一位员工:" +  e2 );
		
		raf.seek(24);
		Emp e3 = new Emp();
		raf.read(buf, 0, 8);
		e3.setName( new String(buf) );
		e3.setAge( raf.readInt() );
		
		System.out.println( "第三位员工:" +  e3 );

	}

}
