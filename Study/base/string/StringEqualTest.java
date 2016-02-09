package string;

public class StringEqualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";
		String s2=s1;
		String s5="abc";
		String s3=new String("abc");
		String s4=new String("abc");
		System.out.println("s1==s5:"+(s1==s5));
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1.equals(s2):"+s1.equals(s2));
		System.out.println("s3==s4:"+(s3==s4));
		System.out.println("s1.equals(s4):"+s1.equals(s4));
		System.out.println("s3.equals(s4):"+s3.equals(s4));
		// t t t f t t
		
	}

}
