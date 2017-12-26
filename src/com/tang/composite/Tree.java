package com.tang.composite;

/**
 * ���ģʽ Composite
 * ���ģʽ��ʱ�ֽв���-����ģʽ�ڴ����������νṹ������ʱ�ȽϷ���
 * @author TangXW
 *
 */
public class Tree {
	private TreeNode root = null;
	
	public Tree(String name){
		root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		
		System.out.println("finish build tree");
	}
}
