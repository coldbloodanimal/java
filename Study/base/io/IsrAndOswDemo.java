package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsrAndOswDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream is=new FileInputStream("dir/raff.data");
		InputStreamReader fisr=new InputStreamReader(is,"utf-8");
		
		FileOutputStream out=new FileOutputStream("dir/out.data");
		OutputStreamWriter osw=new OutputStreamWriter(out);
//		int c;
//		while((c=fisr.read())!=-1){
//			System.out.print((char)c);
//		}
		int l;
		char[] b=new char[10*8];
		while((l=fisr.read(b, 0, 10*8))!=-1){
			osw.write(b, 0, 10*8);
			osw.flush();
			
		}
		osw.close();
		fisr.close();
	}

}
