
public class FindTheFirstAncestor {
	public static void main(String[] args) {
		
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
		
		
		
		
		//using BFS with queue
		System.out.println(node5.checkIfHaveUsingBFS(node2, node6));
		
		//using DFS with stack
		System.out.println(node3.checkIfHaveUsingDFS(node2, node6));
		
		
		System.out.println("*************");
		
		TreeNodeWithParent newNode1 = new TreeNodeWithParent(1);
		TreeNodeWithParent newNode2 = new TreeNodeWithParent(2);
		TreeNodeWithParent newNode3 = new TreeNodeWithParent(3);
		TreeNodeWithParent newNode4 = new TreeNodeWithParent(4);
		TreeNodeWithParent newNode5 = new TreeNodeWithParent(5);
		TreeNodeWithParent newNode6 = new TreeNodeWithParent(6);
		TreeNodeWithParent newNode7 = new TreeNodeWithParent(7);
		TreeNodeWithParent newNode8 = new TreeNodeWithParent(8);
		TreeNodeWithParent newNode9 = new TreeNodeWithParent(9);
		TreeNodeWithParent newNode10 = new TreeNodeWithParent(10);
		TreeNodeWithParent newNode11 = new TreeNodeWithParent(11);
		TreeNodeWithParent newNode12 = new TreeNodeWithParent(12);
		TreeNodeWithParent newNode13 = new TreeNodeWithParent(13);
		TreeNodeWithParent newNode14 = new TreeNodeWithParent(14);
		TreeNodeWithParent newNode15 = new TreeNodeWithParent(15);
		TreeNodeWithParent newNode16 = new TreeNodeWithParent(16);
		TreeNodeWithParent newNode17 = new TreeNodeWithParent(17);
		TreeNodeWithParent newNode18 = new TreeNodeWithParent(18);
		TreeNodeWithParent newNode19 = new TreeNodeWithParent(19);
		TreeNodeWithParent newNode20 = new TreeNodeWithParent(20);
		
		BSTWithParent bstp3 = new BSTWithParent();
		
		bstp3.insert(newNode5);
		bstp3.insert(newNode13);
		bstp3.insert(newNode17);
		bstp3.insert(newNode20);
		bstp3.insert(newNode18);
		bstp3.insert(newNode19);
		bstp3.insert(newNode16);
		bstp3.insert(newNode15);
		bstp3.insert(newNode14);
		bstp3.insert(newNode11);
		bstp3.insert(newNode12);
		bstp3.insert(newNode3);
		bstp3.insert(newNode4);
		bstp3.insert(newNode2);
		bstp3.insert(newNode1);
		bstp3.insert(newNode8);
		bstp3.insert(newNode6);
		bstp3.insert(newNode7);
		bstp3.insert(newNode9);
		bstp3.insert(newNode10);
		
		TreeNodeWithParent firstAncestor = null;
		firstAncestor = bstp3.findTheFirstAncestor(newNode14,newNode18);
		System.out.println(firstAncestor.getValue());
		
	}
	
	
}
