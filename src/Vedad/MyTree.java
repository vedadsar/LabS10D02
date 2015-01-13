package Vedad;

public class MyTree {
	private String data;
	private MyTree left;
	private MyTree right;
	
	public MyTree(){
		data = null;
	}
	public MyTree(String data){
			this.data = data;
			right = null;
			left = null;
		
	}
	public MyTree getLeft() {
		return left;
	}
	public void setLeft(MyTree left) {
		this.left = left;
	}
	public MyTree getRight() {
		return right;
	}
	public void setRight(MyTree right) {
		this.right = right;
	}
	public String getData() {
		return data;
	}	
	
	public void addData(String data){
		if(this.data == null){
			this.data = data;
			return;
		}
		if(this.data.compareToIgnoreCase(data)<0){
			if(left==null)
				left=new MyTree(data);
			else
				left.addData(data);
		}else{
			if(right == null)
				right = new MyTree(data);
			else
				right.addData(data);			
		}		
	}
	
	public void preOrderPrint(){
		System.out.println(data);
		if(left != null) left.preOrderPrint();
		if(right != null) right.preOrderPrint();
		
	}
	
	public void postOrderPrint(){		
		if(left != null) left.preOrderPrint();
		if(right != null) right.preOrderPrint();
		System.out.println(data);
		
	}
	
	public void inOrderPrint(){		
		if(left != null) left.preOrderPrint();
		System.out.println(data);
		if(right != null) right.preOrderPrint();
		
	}
		
}
