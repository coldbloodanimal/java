package tree;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tree> a=new ArrayList<Tree>();
		Tree tree1=new Tree("œ°∑π");
		System.out.println(tree1.getName());
		Tree tree2=new Tree("∞À±¶÷‡");
		Tree tree3=new Tree();
		tree3.add(tree1);
		tree3.add(tree2);
		Tree tree4=new Tree("œ°∑π");
		Tree tree5=new Tree("∞À±¶÷‡");
		Tree tree6=new Tree();
		tree6.add(tree4);
		tree6.add(tree5);
		Tree tree7=new Tree();
		tree7.add(tree3);
		tree7.add(tree6);
		System.out.println();
//		a.add(tree1);
//		a.add(tree2);
		Iterator<Tree> it=a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
