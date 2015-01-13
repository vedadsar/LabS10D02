
public class TestClass {
	public static void main(String[] args) {
	
		PriorityQueue p = new PriorityQueue();
		p.push(4, 4);
		p.push(3, 3);
		p.push(2, 2);
		p.push(1, 1);
		p.push(4, 4);
		p.push(27, 27);
		p.push(18, 18);
		p.push(12, 12);
		
		
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());
	
		
		
	}
}
