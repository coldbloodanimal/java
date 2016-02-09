package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	File file=new File("D:"+File.separator+"aa"+File.separator+"aa"+File.separator+"aa");
		
	//	String filename="D:"+File.separator+"aa";
		String filename="D:"+File.separator+"bb"+File.separator+"bb"+File.separator+"bb";
		System.out.println(filename);
		File file=new File(filename);
		System.out.println(filename+"is exist: "+file.exists());
		if (!file.exists()){
			file.mkdirs();
		}else{
			//file.delete();
		}
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		File file2=new File("D:"+File.separator+"aaaa.class");
		if(!file2.exists()){
			try {
				file2.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			file2.delete();
		}
		System.out.println(file2);
		System.out.println(file2.getAbsoluteFile());
		System.out.println(file2.getParentFile());
	}

}
