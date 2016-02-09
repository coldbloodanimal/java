package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		IOUtil ioUtil=new IOUtil();
		File file=ioUtil.creatFile();
		//ioUtil.printHex3(file.getAbsolutePath());
		copyFile(file,new File("dir"+File.separator+"target1.data"));
//		FileOutputStream os=new FileOutputStream(file,true);
//		os.write(234435);
//		os.write("ÖÐ¹ú".getBytes());

		
	}
	
	public static void printHex2(String fileName) throws IOException{
		FileInputStream in=new FileInputStream(fileName);
		int b;
		int i=1;
		byte[] mybytes=new byte[1024*20];
		in.read(mybytes);
		System.out.println(mybytes.toString());
		in.close();
	}
	
	public static void printHex3(String fileName) throws IOException{
		System.out.println("3");
		FileInputStream in=new FileInputStream(fileName);
		int b;
		int i=0;
		byte[] mybytes=new byte[10];
		while((in.read(mybytes, 0, 10))!=-1){
		//in.read(mybytes,i,10);
			System.out.println(new String(mybytes));

		}

		in.close();
	}
	
	
	public static void printHex(String fileName) throws IOException{
		FileInputStream in=new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=in.read())!=-1){
			System.out.print(Integer.toHexString(b)+"  ");
			if(i++%10==0){
				System.out.println();
			}
		}
		in.close();
	}
	
	public File creatFile(){
		File dir=new File("dir");
		
		if (!dir.exists()){
			dir.mkdir();
		}
		
		File file=new File(dir,"raf.data");
		
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return file;
		
	}
	
	
	public static void copyFile(File src,File target) throws IOException{
		FileInputStream is=new FileInputStream(src);
		FileOutputStream os=new FileOutputStream(target);
		byte[] b=new byte[10];
		int off=0;
		int len=10;
		while((is.read(b, off, len))!=-1){
			os.write(b, off, len);
		}
		is.close();
		os.close();
		
	}

}
