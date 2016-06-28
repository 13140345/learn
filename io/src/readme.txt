一、文件操作
File:
	路径 3种使用方式：
	//"D:\\home\\file.txt"
	//"D:/home/file.txt"
	//"D:" + File.separator + "home" + File.separator + "file"
构造方法:
	File(File parent, String child) 
          	根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
	File(String pathname) 
	          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。 
	File(URI uri) 
	          通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。 
常用方法:
	boolean exists()  					//判断文件或文件夹是否存在/测试此抽象路径名表示的文件或目录是否存在
	boolean createNewFile()  			//创建文件(不是文件夹) /当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件
	boolean mkdir()						//创建此抽象路径名指定的目录
	boolean mkdirs() 					//创建此抽象路径名指定的目录，包括所有必需但不存在的父目录
	boolean isFile( )					//判断此路径是否为文件
	boolean isDirectory( )				//判断此路径是否为目录(文件夹)
	String [] list()					//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录 名称
	File [] listFiles()					//返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件
	String getAbsolutePath()			//返回文件或文件夹的绝对路径
	boolean delete()					//删除此文件或目录
二、文件输入输出流	
2.1 文件输入流 --> FileOutputStream:
构造方法:
	FileInputStream(File file) 
          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。 
	FileInputStream(FileDescriptor fdObj) 
          通过使用文件描述符 fdObj 创建一个 FileInputStream，该文件描述符表示到文件系统中某个实际文件的现有连接。 
	FileInputStream(String name) 
          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定 
常用方法:
	int read() 							//从此输入流中读取一个数据字节,如果返回-1 表示读取结束
	int read(byte [] buf)				//从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中.返回值为该次读取到的字节长度,-1表示读取结束
	int read(byte [] buf, int off, int len)//从此输入流中将最多 len 个字节的数据读入一个 byte 数组中.返回值为该次读取到的字节长度,-1表示读取结束
	void close()						//关闭流	

	
	
	
	
	
	
	
	
	
	