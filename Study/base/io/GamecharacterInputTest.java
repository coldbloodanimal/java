package io;
import java.io.*;
import java.util.ArrayList;
public class GamecharacterInputTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream is=new FileInputStream("d:/gaga/MyGame.ser");
		
		ObjectInputStream oi=new ObjectInputStream(is);
		
		ArrayList<GameCharacter> gcs=new ArrayList<GameCharacter>(3);
		gcs.add((GameCharacter) oi.readObject());
		gcs.add((GameCharacter) oi.readObject());
		gcs.add((GameCharacter) oi.readObject());
		
		for(GameCharacter g:gcs){
			System.out.println(g);
		}
		
		oi.close();

		
		
	}

	
}
