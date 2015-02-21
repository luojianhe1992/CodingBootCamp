
public class TreeNodeForBT {
	int value;
	TreeNodeForBT lChild;
	TreeNodeForBT rChild;
	
	public TreeNodeForBT() {
		super();
		this.lChild = null;
		this.rChild = null;
	}

	public TreeNodeForBT(int value) {
		super();
		this.value = value;
		this.lChild = null;
		this.rChild = null;
	}

	public TreeNodeForBT(int value, TreeNodeForBT lChild, TreeNodeForBT rChild) {
		super();
		this.value = value;
		this.lChild = lChild;
		this.rChild = rChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNodeForBT getlChild() {
		return lChild;
	}

	public void setlChild(TreeNodeForBT lChild) {
		this.lChild = lChild;
	}

	public TreeNodeForBT getrChild() {
		return rChild;
	}

	public void setrChild(TreeNodeForBT rChild) {
		this.rChild = rChild;
	}
	
	
	
}
