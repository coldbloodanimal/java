package reflection;

public class ReflectionTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Class c=Class.forName("reflection.Dog");
		Animal a=(Animal) c.newInstance();
		a.lookLike();
		System.out.println(dog.getClass());
	}

}
