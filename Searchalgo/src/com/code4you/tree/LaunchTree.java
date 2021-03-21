package com.code4you.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaunchTree {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(5);
		tree.insert(33);
		
		
		System.out.println(tree.root);
		System.out.println(tree.root.left);
		System.out.println(tree.root.right);
		System.out.println(tree.root.right.right);
		tree.printTree();
		
		//tree.remove(20);
		
		System.out.println(tree.get(33));
		
		List<Integer> breathFirstSearch = tree.breathFirstSearch();
		Iterator<Integer> iterator = breathFirstSearch.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			
		}
		System.out.println("\n"+tree.maxDepth(tree.root));
	}
	
	

}
