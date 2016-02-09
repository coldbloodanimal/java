package boxing;

public class BoxTestInt {

	Integer i;
	 int j;
	 public static void main (String[] args) {
		 BoxTestInt t = new BoxTestInt();
	 t.go();
	 }
	 public void go() {
	 j=i;
	 System.out.println(j);
	 System.out.println(i);
	 }
	

}
