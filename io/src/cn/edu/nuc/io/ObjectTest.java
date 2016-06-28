package cn.edu.nuc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest {

	public static void main(String[] args) {
		Emp emp = new Emp(345, "张三", 18);
		
		ObjectStream.write("/goods/" + emp.getEmpNo() + ".dat", emp);
		
		Emp emp1 = ObjectStream.read(Emp.class, "/goods/345.dat");
		
		System.out.println( emp1 );
		
		Cart c = new Cart("test");
		
		ObjectStream.write("/goods/123.dat", c);
		
		Cart c1 = ObjectStream.read(Cart.class, "/goods/123.dat");
		System.out.println(c1);
		
		/*FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("d:/home/"+ emp.getEmpNo() + ".dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( oos != null ) oos.close();
				if( fos != null ) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("d:/home/" + 345 + ".dat");
			ois = new ObjectInputStream(fis);
			
			Emp e = (Emp)ois.readObject();
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if( ois != null ) ois.close();
				if( fis != null ) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/

	}
	
	public static String getGoodsPath( String gid){
		return "/goods" + gid + ".dat";
	}

}
