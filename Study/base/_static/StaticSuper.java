package _static;

public class StaticSuper {
	public static double PI=3.14;
	/**
	 * @param args
	 */
	static {
		 System.out.println("super static block");
		 }

		 StaticSuper(){
		 System.out.println("super constructor");
		 }

}
