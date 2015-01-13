
public class PriorityQueue {
	
	private Node head;
	private Node tail;
	
	/**
	 * Method which push node in our Queue. Place where node will be set depends on its priority.
	 * @param value - Value of node
	 * @param priority - node's priority
	 */
	public void push(int value,int priority){
		
		Node newNode = new Node(value, priority);			//Creating new node, one that we are going to push in our queue
			
		if(head == null){									//Case1, our head is null. That means our queue is empty
			head = tail =newNode;
			return;
		}
		
		if(head == tail) {									//Case 2, our queue has only one node.
			if(newNode.priority < head.priority) {          // In case our head priority is higher then new node's priority
				tail.next = newNode;
				tail = tail.next;
				return;
			}
			newNode.next = head;                           //Case when our head prio is lower then new node's prio
			head = newNode;
			return;
		}
	
		if(head.priority < newNode.priority){					 //Case our head priority is lower then our new nodes priority		
			newNode.next = head;
			head = newNode;
			return;			
		}
			
	
		Node prev = head;
		Node current = head.getNext();		
		while(current != null){										//Loop where we check if our currents prio is lower/higher then our new node's priority
			if(current.getPriority() < newNode.getPriority()){
				prev.setNext(newNode);
				newNode.setNext(current);
				return;
			}
				prev = prev.getNext();
				current = current.getNext();			
				
		}
		tail.next = newNode;										//Normal push for queue.
		tail = newNode;
		
	
	}
	
	/**
	 * Pop method same as pop method for normal queues. First in, first out.
	 * @return
	 */
	public int pop(){
		if(head == null)
			throw new ArrayIndexOutOfBoundsException("nesto");
		if(head == tail){
			int result =head.getValue();
			head = null;
			tail = null;
			return result;
		}
		int result =head.getValue();
		head = head.getNext();
		return result;
	}
	
	/**
	 * Peek method which just return us value of head.
	 * @return
	 */
	public int peek(){
		if(head == null)
			throw new ArrayIndexOutOfBoundsException("nesto");
		int result =head.getValue();
		return result;
	}
	
	/**
	 * Returns true or false depending if our queue is empty or not.
	 * @return
	 */
	public boolean isEmpty(){
		if (head == null)
			return true;
		return false;
	}
	
	/**
	 * Class node for integers. This class has priority value so we can use it in priority queues.
	 * @author vedadzornic
	 *
	 */
	public class Node {
		private int value;
		private Node next;
		private int priority;
		
		public Node(int value){
			this.value = value;
			this.priority =0;
		}
		
		public Node(int value, int priority){
			this.value = value;
			this.priority = priority;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public int getPriority() {
			return priority;
		}
				
	}

}
