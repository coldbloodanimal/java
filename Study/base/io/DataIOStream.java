package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("dir/raf.data");
		FileOutputStream os=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(os);
		
		FileInputStream is=new FileInputStream("dir/raf.data");
		DataInputStream dis=new DataInputStream(is);
		String s = "there is a beautiful place";
		//dos.writeChars(s);
		dos.writeInt(34456);
		dos.writeUTF("ÖÐ¹ú");
		//dis.readInt();
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		dis.close();
		dos.close();
	}

}
