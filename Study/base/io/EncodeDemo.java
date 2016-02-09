package io;

public class EncodeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String s="Ä½¿ÎABC";
		byte[] bytes1=s.getBytes();
		for(byte b:bytes1){
			System.out.print(b+"\t");
		}
		System.out.println();
		byte[] bytes5=s.getBytes();
		for(byte b:bytes5){
			System.out.print(Integer.toHexString(b & 0xff)+"\t");

		}
		System.out.println();
		byte[] bytes6=s.getBytes();
		for(byte b:bytes6){
			System.out.print(Integer.toHexString(b & 255)+"\t");
		}
		System.out.println();
		byte[] bytes2=s.getBytes("gbk");
		for(byte b:bytes2){
			System.out.print(Integer.toHexString(b & 0xff)+"\t");
		}
		System.out.println();		
		byte[] bytes4=s.getBytes("utf-8");
		for(byte b:bytes4){
			System.out.print(Integer.toHexString(b & 0xff)+"\t");
		}
		
		System.out.println();		
		byte[] bytes3=s.getBytes("utf-16be");
		for(byte b:bytes3){
			System.out.print(Integer.toHexString(b & 0xff)+"\t");
		}
		System.out.println();			
		String str1=new String(bytes2);
		System.out.println(str1);


	}

}
