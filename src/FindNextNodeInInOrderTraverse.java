
public class FindNextNodeInInOrderTraverse {
	public static void main(String[] args) {
		
		BSTWithParent bstp = new BSTWithParent();
		bstp.addNode(5);
		bstp.addNode(3);
		bstp.addNode(2);
		bstp.addNode(1);
		bstp.addNode(4);
		bstp.addNode(8);
		bstp.addNode(6);
		bstp.addNode(7);
		bstp.addNode(9);
		bstp.addNode(10);
		
		//order traverse
		bstp.inOrderTraverse();
		bstp.preOrderTraverse();
		bstp.postOrderTraverse();
		
		System.out.println("*****************");
		
		TreeNodeWithParent node1 = new TreeNodeWithParent(1);
		TreeNodeWithParent node2 = new TreeNodeWithParent(2);
		TreeNodeWithParent node3 = new TreeNodeWithParent(3);
		TreeNodeWithParent node4 = new TreeNodeWithParent(4);
		TreeNodeWithParent node5 = new TreeNodeWithParent(5);
		TreeNodeWithParent node6 = new TreeNodeWithParent(6);
		TreeNodeWithParent node7 = new TreeNodeWithParent(7);
		TreeNodeWithParent node8 = new TreeNodeWithParent(8);
		TreeNodeWithParent node9 = new TreeNodeWithParent(9);
		TreeNodeWithParent node10 = new TreeNodeWithParent(10);
		
		BSTWithParent bstp2 = new BSTWithParent();
		
		bstp2.insert(node5);
		bstp2.insert(node3);
		bstp2.insert(node2);
		bstp2.insert(node1);
		bstp2.insert(node4);
		bstp2.insert(node8);
		bstp2.insert(node6);
		bstp2.insert(node7);
		bstp2.insert(node9);
		bstp2.insert(node10);
		
		System.out.println(node5.getNextInOrder().getValue());
	}
}
