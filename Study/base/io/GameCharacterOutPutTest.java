package io;

import java.io.*;

public class GameCharacterOutPutTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		 GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		 GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});
		 
		 FileOutputStream fileStream=new FileOutputStream("d:/gaga/MyGame.ser");
		 
		 ObjectOutputStream os=new ObjectOutputStream(fileStream);
		 
		 os.writeObject(one);
		 os.writeObject(two);
		 os.writeObject(three);
		 
		 os.close();
		 
	}

}
