package tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tree implements Iterator<Tree>{
	private boolean isleaf=false;
	private String name;
	private ArrayList<Tree> tree=new ArrayList<Tree>();

	public Tree() {
		super();
		this.isleaf = true;
	}
	public Tree(boolean isleaf, String name, ArrayList<Tree> tree) {
		super();
		this.isleaf = isleaf;
		this.name = name;
		this.tree = tree;
	}
	public Tree(String name) {
		super();
		this.name = name;
	}
	public Tree(boolean	isleaf) {
		super();
		this.isleaf = isleaf;
	}
	public ArrayList<Tree> getTree() {
		return tree;
	}
	public void setTree(ArrayList<Tree> tree) {
		this.tree = tree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.isleaf = false;
	}
	public boolean isIsleaf() {
		return isleaf;
	}
	public void setIsleaf(boolean isleaf) {
		this.isleaf = isleaf;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(this.tree.size()!=0){
			
		}
		return tree.iterator().hasNext();
	}
	@Override
	public Tree next() {
		// TODO Auto-generated method stub
		return tree.iterator().next();
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	public void add(Tree e){
		tree.add(e);
	}

	



}
