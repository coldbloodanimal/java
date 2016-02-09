package consturctor;

public class Dog implements Eat{

	private int size;
	public Dog(int size){
		this.size=size;
	}
	public static void main(String[] args){
		
		doStuff();

		System.out.println("hello");

	}
	@Override
	public void eatBehavior() {
		// TODO Auto-generated method stub
		
	}
	
	public static void doStuff(){
		Dog d=new Dog(1);
	}

}
