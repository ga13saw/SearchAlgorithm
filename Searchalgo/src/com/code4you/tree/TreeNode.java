package com.code4you.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void insert(int value) {
		if(data == value){
			return;
		}
		// left
		if (value < data) {

			if (left == null) {
				left = new TreeNode(value);

			} else {
				left.insert(value);
			}

		} else {
			if (right == null) {
				right = new TreeNode(value);
			} else {
			
				right.insert(value);
			}

		}

	}
	
	public void inOrderTraverse() {
		if (left != null) {
			left.inOrderTraverse();
		}
		System.out.println(data + " ");
		
		if (right!=null) {
			right.inOrderTraverse();
		}
	}
	
	public List<Integer> breathFirstSearch(TreeNode node) {
		
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			TreeNode currentNode = queue.remove();
			list.add(currentNode.data);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right != null){
				queue.add(currentNode.right);
			}
		}
		return list;
		
	}
	
	

	@Override
	public String toString() {
		return " [data=" + data + "]";
	}

	public TreeNode get(int value) {
		if (data == value) {
			return this;
		}
		
		if (value < data) {
			if (left != null) {
				return left.get(value);
			}
		}else{
			if (right != null) {
				return right.get(value);
			}
		}
		
		return null;
	}

	public TreeNode remove(int value) {
		
		
		return left;
		
		
	}
	
	 int currdepth=1;
	 int maxdepth=1;
	public int maxDepth(TreeNode root) {
	
		//return (root==null) ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	traverse(root);
	return maxdepth;
	}

	private void traverse(TreeNode root) {
		if (root.left == null && root.right== null) {
			maxdepth= Math.max(currdepth, maxdepth);
		}
		currdepth++;
		if (root.left != null) {
			traverse(root.left);
		}
		if (root.right != null) {
			traverse(root.right);
		}
		currdepth--;
	}

}
