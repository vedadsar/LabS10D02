package BinaryThreeSearch;

public class TestClass {
	public static void main(String[] args) {
	BinarySearchThree b = new BinarySearchThree();
	
	b.add(5);
	b.add(3);
	b.add(3);
	b.add(4);
	b.add(7);
	b.add(6);
	
	
	b.print();
	
	System.out.println(b.contains(6));
	}
}
