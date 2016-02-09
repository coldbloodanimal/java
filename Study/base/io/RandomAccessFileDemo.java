package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File dir=new File("dir");
		
		if (!dir.exists()){
			dir.mkdir();
		}
		
		File file=new File(dir,"raf.data");
		
		if (!file.exists()){
			file.createNewFile();
		}
		System.out.println(file.getPath());
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		
		System.out.println(raf.getFilePointer());
		
		raf.write('A');
		
		System.out.println(raf.getFilePointer());
		
		raf.writeChars("Œ“");
		System.out.println(raf.getFilePointer());
//		raf.readByte();
		raf.seek(1);
		long longth=raf.length();
		System.out.println(longth);
//		System.out.println(raf.readByte());
//		System.out.println(raf.readByte());
		System.out.println(raf.readChar());
		System.out.println(raf.readByte());
		System.out.println(raf.readChar());
		System.out.println(raf.readChar());
		raf.close();
	}

}
