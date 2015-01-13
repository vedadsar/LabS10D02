package BinaryThreeSearch;

public class BinarySearchThree {
	private Node root;
	
	public BinarySearchThree(){
		this.root = null;
	}
	
	public void add(int value){
		if(root == null){
			root = new Node(value);
		}else
			add(root, value);
	}
	
	/**
	 * Private method to add node in binary three using recursion.
	 * @param current
	 * @param value
	 */
	private void add(Node current, int value){
		if(current == null){				//Ovaj if ne radi
			current = new Node(value);
			return;			
		}
			
		if(value <= current.getValue()){
			if(current.getLeft() == null){
				current.setLeft(new Node(value));
				return;
			}
			add(current.getLeft(), value);
		}else{
			if(current.getRight() == null){
				current.setRight(new Node(value));
				return;
			}
			add(current.getRight(), value);
		}
	}
	
	public void print(){
		print(root);
	}
	
	/**
	 * Private method which prints our BinarySearchThree recursivly. It first print all left, then all middle, then all rights.
	 * @param root
	 */
	private void print(Node root){
		if(root == null)
			return;
		else{
			print(root.getLeft());
			System.out.println(root.getValue());
			print(root.getRight());
		}		
	}
	
	public boolean contains(int value){
		if(root == null)
			throw new IllegalStateException("Prazna lista");
		else
			return contains(root, value);
		
	}
	
	/**
	 * Private contains method which is binary searching for sent value in our Binary three. returning true either false.
	 * @param current
	 * @param value
	 * @return
	 */
	private boolean contains(Node current, int value){
		
		if(current.getValue() == value){
			return true;
		
		}else if(value <= current.getValue()){
			if(current.getLeft() == null){
				return false;
			}
			return contains(current.getLeft(), value);			
		
		}else{
			if(current.getRight() == null)
				return false;
		
		return 	contains(current.getRight(), value);			
		}
		
	}
		
}
