import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TreeNodeWithParent {
	int value;
	TreeNodeWithParent lChild;
	TreeNodeWithParent rChild;
	TreeNodeWithParent parent;
	
	public TreeNodeWithParent() {
		super();
	}

	public TreeNodeWithParent(int value) {
		super();
		this.value = value;
	}

	public TreeNodeWithParent(int value, TreeNodeWithParent lChild,
			TreeNodeWithParent rChild, TreeNodeWithParent parent) {
		super();
		this.value = value;
		this.lChild = lChild;
		this.rChild = rChild;
		this.parent = parent;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNodeWithParent getlChild() {
		return lChild;
	}

	public void setlChild(TreeNodeWithParent lChild) {
		this.lChild = lChild;
	}

	public TreeNodeWithParent getrChild() {
		return rChild;
	}

	public void setrChild(TreeNodeWithParent rChild) {
		this.rChild = rChild;
	}

	public TreeNodeWithParent getParent() {
		return parent;
	}

	public void setParent(TreeNodeWithParent parent) {
		this.parent = parent;
	}
	
	//in-order find next node
	public TreeNodeWithParent getNextInOrder(){
		
		if(this.getrChild() != null){
			return getLeftMostNode(this.getrChild());
		}
		else if(this.equals(this.getParent().getrChild())){
			TreeNodeWithParent pointer = goUp(this);
			return pointer;
		}
		else{
			return this.getParent();
		}
		
	}
	
	public TreeNodeWithParent getLeftMostNode(TreeNodeWithParent node){
		TreeNodeWithParent pointer = node;
		
		//pointer move
		while(pointer.getlChild() != null){
			pointer = pointer.getlChild();
		}
		
		return pointer;
	}
	
	public TreeNodeWithParent getRightMostNode(TreeNodeWithParent node){
		TreeNodeWithParent pointer = node;
		
		while(pointer.getrChild() != null){
			pointer = pointer.getrChild();
		}
		
		return pointer;
	}
	
	//go up until there is a right child
	public TreeNodeWithParent goUp(TreeNodeWithParent node){
		TreeNodeWithParent pointer = node.getParent();
		
		while(pointer.getrChild() == null || (pointer.getrChild()== node) ){
			pointer = pointer.getParent();
		}
		
		return pointer;
	}
	
	/*
	public boolean checkIfHave(TreeNodeWithParent node1, TreeNodeWithParent node2){
		
		return checkIfHave(this, node1, node2);
	}
	
	public boolean checkIfHave(TreeNodeWithParent node, TreeNodeWithParent node1, TreeNodeWithParent node2){
		
		if(node == null){
			return false;
		}
		
		if(node == node1 || node == node2){
			return true;
		}
		
		return checkIfHave(node.getlChild(), node1, node2) && 
				checkIfHave(node.getrChild(), node1, node2);
		
	}
	*/
	
	//using BFS to check
	public boolean checkIfHaveUsingBFS(TreeNodeWithParent node1, TreeNodeWithParent node2){
		
		boolean checkNode1 = false;
		boolean checkNode2 = false;
		
		Queue<TreeNodeWithParent> myQueue = new LinkedList<TreeNodeWithParent>();
		
		//push the node into queue
		myQueue.add(this);
		
		//using queue to do bfs to iterate the subtree
		while(!myQueue.isEmpty()){
			TreeNodeWithParent tempNode = myQueue.poll();
			if(tempNode == node1){
				checkNode1 = true;
			}
			if(tempNode == node2){
				checkNode2 = true;
			}
			
			if(checkNode1 && checkNode2){
				return true;
			}
			if(tempNode.getlChild() != null){
				myQueue.add(tempNode.getlChild());
			}
			if(tempNode.getrChild() != null){
				myQueue.add(tempNode.getrChild());
			}
			
		}
		return false;
		
	}
	
	//using DFS to check
	public boolean checkIfHaveUsingDFS(TreeNodeWithParent node1, TreeNodeWithParent node2){
		
		boolean checkNode1 = false;
		boolean checkNode2 = false;
		
		Stack<TreeNodeWithParent> myStack = new Stack<TreeNodeWithParent>();
		
		myStack.push(this);
		
		//using stack to iterate all the node in the subtree
		while(!myStack.isEmpty()){
			TreeNodeWithParent tempNode = myStack.pop();
			if(tempNode == node1){
				checkNode1 = true;
			}
			if(tempNode == node2){
				checkNode2 = true;
			}
			if(checkNode1 && checkNode2){
				return true;
			}
			if(tempNode.getlChild()!=null){
				myStack.push(tempNode.getlChild());
			}
			if(tempNode.getrChild()!=null){
				myStack.push(tempNode.getrChild());
			}
		}
		return false;
		
	}

}
