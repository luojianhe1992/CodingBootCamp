
public class CheckBST {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.addNode(5);
		bst.addNode(3);
		bst.addNode(2);
		bst.addNode(1);
		bst.addNode(4);
		bst.addNode(8);
		bst.addNode(7);
		bst.addNode(9);
		bst.addNode(10);
		System.out.println(checkBST(bst.getRoot()));
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		
		node4.setlChild(node3);
		node3.setlChild(node5);
		node3.setrChild(node2);
		node2.setlChild(node1);
		node4.setrChild(node9);
		node4.setlChild(node10);
		node9.setlChild(node8);
		node8.setrChild(node6);
		node8.setlChild(node7);
		
		System.out.println(checkBST(node4));
		System.out.println(checkBST(node3));
	}
	
	public static boolean checkBST (TreeNode node){
		if(node == null){
			return true;
		}
		else if(node.getlChild() == null && node.getrChild() == null){
			return true;
		}
		else if(node.getlChild() == null){
			if(node.getValue() > node.getrChild().getValue()){
				return false;
			}
			return checkBST(node.getrChild());
		}
		else if(node.getrChild() == null){
			if(node.getValue() < node.getlChild().getValue()){
				return false;
			}
			return checkBST(node.getlChild());
		}
		else{
			if(node.getlChild().getValue() > node.getValue() ||//
					node.getrChild().getValue() < node.getValue()){
				return false;
			}
			return (checkBST(node.getlChild()) && checkBST(node.getrChild()));
			
		}
		
		
	}
}
