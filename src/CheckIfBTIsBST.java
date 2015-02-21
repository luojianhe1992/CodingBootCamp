
public class CheckIfBTIsBST {
	public static void main(String[] args) {
		TreeNodeForBT node1 = new TreeNodeForBT(1);
		TreeNodeForBT node2 = new TreeNodeForBT(2);
		TreeNodeForBT node3 = new TreeNodeForBT(3);
		TreeNodeForBT node4 = new TreeNodeForBT(4);
		TreeNodeForBT node5 = new TreeNodeForBT(5);
		TreeNodeForBT node6 = new TreeNodeForBT(6);
		TreeNodeForBT node7 = new TreeNodeForBT(7);
		TreeNodeForBT node8 = new TreeNodeForBT(8);
		TreeNodeForBT node9 = new TreeNodeForBT(9);
		TreeNodeForBT node10 = new TreeNodeForBT(10);
		
		node5.setlChild(node3);
		node5.setrChild(node8);
		node3.setlChild(node2);
		node3.setrChild(node4);
		node2.setlChild(node1);
		node8.setlChild(node7);
		node8.setrChild(node9);
		node7.setlChild(node6);
		node9.setlChild(node10);
		
		BinaryTree binaryTree = new BinaryTree(node5);
		
		System.out.println(binaryTree.checkIfIsBST());
		
		
	}
	
	
}
