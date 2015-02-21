import java.util.ArrayList;


public class BinaryTree {
	TreeNodeForBT root;
	int size;
	
	public BinaryTree() {
		super();
		size = 0;
	}

	public BinaryTree(TreeNodeForBT root) {
		super();
		this.root = root;
		size = 1;
	}

	public BinaryTree(TreeNodeForBT root, int size) {
		super();
		this.root = root;
		this.size = size;
	}

	public TreeNodeForBT getRoot() {
		return root;
	}

	public void setRoot(TreeNodeForBT root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void inOrderTraverseStoreInArrayList(ArrayList<TreeNodeForBT> result){
		inOrderTraverseStoreInArrayList(result, this.getRoot());
	}
	
	public void inOrderTraverseStoreInArrayList(ArrayList<TreeNodeForBT> result, TreeNodeForBT node){
		//go left
		if(node.getlChild() != null){
			inOrderTraverseStoreInArrayList(result, node.getlChild());
		}
		
		//add the node
		result.add(node);
	
		//go rights
		if(node.getrChild() != null){
			inOrderTraverseStoreInArrayList(result, node.getrChild());
		}
	}
	
	public boolean checkIfIsBST(){
		
		ArrayList<TreeNodeForBT> traverseResult = new ArrayList<TreeNodeForBT>();
		
		inOrderTraverseStoreInArrayList(traverseResult);
		
		for(int i=0;i<traverseResult.size() - 1;i++){
			if(traverseResult.get(i).getValue() > traverseResult.get(i + 1).getValue()){
				return false;
			}
		}
		return true;
	}
	
	
	
}
