package io;

import java.io.File;
import java.io.*;
public class FileUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	public static void listMyDirectory(File file){
		if(!file.exists()){
			throw new IllegalArgumentException("文件:"+file+"不存在");
		}
		if(!file.isDirectory()){
			System.out.println(file);
		}else{
		String[] filenames=file.list();
		for(String p:filenames){
			
			System.out.println(file+File.separator+p);
			listMyDirectory(new File(file+File.separator+p));
			
		}
		}
	}
	
	public static void listMyDirectory2(File file){
		if(!file.exists()){
			throw new IllegalArgumentException("文件:"+file+"不存在");
		}
		if(!file.isDirectory()){
			System.out.println(file);
		}else{
		File[] filenames=file.listFiles();
		for(File p:filenames){
			
			System.out.println(file+File.separator+p);
			listMyDirectory2(p);
			
		}
		}
	}
}
