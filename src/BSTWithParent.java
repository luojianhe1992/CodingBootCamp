import java.util.ArrayList;


public class BSTWithParent {
	int size;
	TreeNodeWithParent root;
	
	public BSTWithParent() {
		super();
		size = 0;
	}

	public BSTWithParent(TreeNodeWithParent root) {
		super();
		this.root = root;
		size = 1;
	}

	public BSTWithParent(int size, TreeNodeWithParent root) {
		super();
		this.size = size;
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public TreeNodeWithParent getRoot() {
		return root;
	}

	public void setRoot(TreeNodeWithParent root) {
		this.root = root;
	}
	
	public void insert(TreeNodeWithParent node){
		if(root == null){
			root = node;
			size++;
		}
		else{
			TreeNodeWithParent previous = null;
			TreeNodeWithParent current = root;
			
			while(current != null){
				//move left
				if(node.getValue() < current.getValue()){
					previous = current;
					current = current.getlChild();
				}
				//move right
				else{
					previous = current;
					current = current.getrChild();
				}
			}
			
			//add the size
			size++;
			
			//connect the node
			if(previous.getValue() < node.getValue()){
				previous.setrChild(node);
				node.setParent(previous);
			}
			else{
				previous.setlChild(node);
				node.setParent(previous);
			}
		}
	}
	
	public void addNode(int value){
		if(root == null){
			TreeNodeWithParent node = new TreeNodeWithParent(value);
			root = node;
			size++;
		}
		else{
			
			TreeNodeWithParent previous = null;
			TreeNodeWithParent current = root;
			
			while(current != null){
				
				//move left
				if(value < current.getValue()){
					previous = current;
					current = current.getlChild();
				}
				//move right
				else{
					previous =  current;
					current = current.getrChild();
				}
			}
			
			TreeNodeWithParent node = new TreeNodeWithParent(value);
			
			//add the size
			size++;
			
			//connect the node
			if(value < previous.getValue()){
				previous.setlChild(node);
				node.setParent(previous);
			}
			else{
				previous.setrChild(node);
				node.setParent(previous);
			}
		}
	}
	
	public void inOrderTraverse(){
		
		StringBuilder sb = new StringBuilder();
		
		inOrderTraverse(root, sb);
		
		System.out.println(sb.toString());
	}
	
	public void inOrderTraverse(TreeNodeWithParent node, StringBuilder sb){
		
		//go left
		if(node.getlChild() != null){
			inOrderTraverse(node.getlChild(), sb);
		}
		
		//print the middle
		sb.append(node.getValue());
	
		//go rights
		if(node.getrChild() != null){
			inOrderTraverse(node.getrChild(), sb);
		}
	}
	
	
	public void preOrderTraverse(){
		StringBuilder sb = new StringBuilder();
		
		preOrderTraverse(root, sb);
		
		System.out.println(sb.toString());
	}
	
	public void preOrderTraverse(TreeNodeWithParent node,StringBuilder sb ){
		sb.append(node.getValue());
		
		if(node.getlChild() != null){
			preOrderTraverse(node.getlChild(), sb);
		}
		
		if(node.getrChild() != null){
			preOrderTraverse(node.getrChild(), sb);
		}
	}
	
	
	
	public void postOrderTraverse(){
		StringBuilder sb = new StringBuilder();
		
		postOrderTraverse(root, sb);
		
		System.out.println(sb.toString());
	}
	
	
	
	public void postOrderTraverse(TreeNodeWithParent node, StringBuilder sb){
		if(node.getlChild() != null){
			postOrderTraverse(node.getlChild(), sb);
		}
		
		if(node.getrChild() != null){
			postOrderTraverse(node.getrChild(), sb);
		}
		
		sb.append(node.getValue());
	}
	public TreeNodeWithParent findTheFirstAncestor(TreeNodeWithParent node1, TreeNodeWithParent node2){
		
		
		TreeNodeWithParent current = this.getRoot();
		
		return findTheFirstAncestor(current, node1, node2);
		
	}
	
	//
	public TreeNodeWithParent findTheFirstAncestor(TreeNodeWithParent current, TreeNodeWithParent node1, TreeNodeWithParent node2){
		
		//check left subtree
		if(current.getlChild().checkIfHaveUsingBFS(node1, node2)){
			current = current.getlChild();
			return findTheFirstAncestor(current, node1, node2);
		}
		//check right subtree
		else if(current.getrChild().checkIfHaveUsingBFS(node1, node2)){
			
			current = current.getrChild();
			return findTheFirstAncestor(current, node1, node2);
		}
		else{
			return current;
		}
	}
}
