package animal;

import java.util.ArrayList;

public class AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> myarray=new ArrayList<Animal>();
		myarray.add(new Dog());
		if(myarray.get(0) instanceof Dog){
			System.out.println("cool");
		}
		Dog d=(Dog) myarray.get(0);
		Pig p;

	}

}
