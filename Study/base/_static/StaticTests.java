package _static;

public class StaticTests extends StaticSuper {

	/**
	 * @param args
	 */
	 static int rand;
	 static {
	 rand = (int) (Math.random() * 6);
	 System.out.println("static block " + rand);
	 }
	 StaticTests() {
	 System.out.println("constructor");
	 }
	 public static void main(String [] args) {
	 System.out.println(StaticTests.PI);
	 System.out.println("in main");
	 StaticTests st = new StaticTests();
	 StaticTests st1 = new StaticTests();
	 
	 System.out.println(st.PI);
	 }
}
