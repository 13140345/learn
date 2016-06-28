package cn.edu.nuc.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ArrayDataTest {

	public static void main(String[] args) throws IOException {
		int x = -9000000;
		/*ByteArrayOutputStream baos = null;
		DataOutputStream dos = null;*/
		byte [] buf = null;
		try(
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				DataOutputStream dos = new DataOutputStream(baos);
			){
			
			/*baos = new ByteArrayOutputStream();
			dos = new DataOutputStream(baos);*/
			dos.writeInt( x );
			buf = baos.toByteArray();
		
			System.out.println( buf[0] + " " + buf[1] + " " + buf[2] + " " + buf[3] );
		} catch (IOException e){
			e.printStackTrace();
		}/* finally {
			if( dos != null ){
				dos.close();
			}
			if( baos != null){
				baos.close();
			}
		}*/
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		DataInputStream dis = new DataInputStream(bais);
		int i = dis.readInt();
		System.out.println( "i=" + i );
		
		
		byte [] b = new byte[4];
		b[0] = (byte)(x >>> 24);
		b[1] = (byte)(x >>> 16);
		b[2] = (byte)(x >>> 8);
		b[3] = (byte)(x);
		
		System.out.println( b[0] + " " + b[1] + " " + b[2] + " " + b[3] );
		
		int i2 = 0xff000000 & b[0] << 24 | 0xff0000 & b[1] << 16 | 0xff00 & b[2] << 8 | 0xff & b[3];
		
		System.out.println("i2=" + i2);
		

	}

}
