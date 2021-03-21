package com.code4you.tree;

import java.util.List;

public class Tree {
	public TreeNode root;
	

	public Tree() {
		this.root = null;
	}

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
			
		} 
		else{
			root.insert(value);
		}

	}
	
	public void printTree() {
		if (root!=null) {
			root.inOrderTraverse();
		}
		return;
	}

	public TreeNode remove(int value) {
		if (root==null) {
			return null;
		}
		return root.remove(value);
	}

	public TreeNode get(int value) {
		if(root ==null){
			return null;
		}
		return root.get(value);
		
	}
	
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return root.maxDepth(root);
	}
	
	public List<Integer> breathFirstSearch() {
		if (root != null) {
			return root.breathFirstSearch(root);
		}
		return null;
	}
}
















