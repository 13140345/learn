package cn.edu.nuc.io;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
	
	private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) throws IOException, ParseException {
		
		//Date d = format.parse("2016-05-01 12:01:23");
		
		//D:\\home\\file.txt
		//D:/home/file.txt
		//"D:" + File.separator + "home" + File.separator + "file"
		/*File file = new File("D:" + File.separator + "home" + File.separator + "test.txt");
		
		if( ! file.exists() ){
			file.createNewFile();
		}
		
		File dir = new File("D:/home/cn/edu/nuc/io");
		
		if( ! dir.exists() ){
			dir.mkdir();
		}*/
		
		File dir = new File("/hello.txt");
		if( ! dir.exists() ){
			
			dir.createNewFile();
		}
		System.out.println( dir.getAbsolutePath() );
		//dir.delete();
		
		
		
		/*File f = File.createTempFile( "prefix",  "suffix");
		System.out.println( f.getAbsolutePath() );*/
		//System.out.println( dir.list().length );
		
		/*String [] files = dir.list();
		for(String s : files){
			//根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
			File f = new File(dir, s);
			System.out.println("名称:" + f.getName() + ",大小:" + f.length());
		}*/
		
		/*File [] files = dir.listFiles();
		for(File f : files){
			System.out.println("名称:" + f.getName() + ",大小:" + f.length());
		}*/
		
		
		//递归
		//files( dir );

	}
	
	
	public static void files( File f ){
		//如果此File对象目录下有子目录或子文件
		if( f.list().length > 0 ){
			//获取此File对象子目录文件数组File对象
			File [] fs = f.listFiles();
			//迭代此目录
			for( File files : fs ){
				//打印此文件或目录的绝对路径
				System.out.println( "-->" + files.getAbsolutePath() + ",最后修改时间:" + format.format(new Date(files.lastModified())) );
				//如果此File对象是文件夹(目录)
				if( files.isDirectory() ){
					files( files );
				}
			}
		}
	}

}
