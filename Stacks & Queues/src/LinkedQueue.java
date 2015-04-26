
public class LinkedQueue <T>{
	
	private Node lastNode;
	
	public LinkedQueue()
	{
		lastNode = null;
	}
	public boolean isEmpty()
	{
		return lastNode == null;
	}
	public void enqueue(T element)
	{
		
		Node newNode = new Node(element);
		if(!isEmpty())
		{	
			newNode.next = lastNode.next;
			lastNode.next = newNode;
			lastNode = newNode;
		}
		else
		{
			newNode.next=newNode;
			lastNode = newNode;
		}
	
	}
	
	public T getFirst()
	{
		if(!isEmpty())
		{
			return lastNode.next.element;
		}
		return null;
	}
	
	public T dequeue()
	{
		T tmp = lastNode.next.element;
		if(!isEmpty())
		{
			lastNode.next=lastNode.next.next;
			return tmp;
		}
		return null;
	}
	public void yazdir()
	{
		Node current = lastNode.next;
		System.out.print("[");
		while(true)
		{
			System.out.print(current.element+",");
			if(current == lastNode)
				break;
			current = current.next;
		}
		System.out.print("]");

		
	}
	
	private class Node
    {
		public Node(T e) 
		{
			element = e;
		}
		
		private T element; 
        private Node next; 
        
    }
	public static void main(String[] args) {
		
		LinkedQueue<Integer> lq = new LinkedQueue<Integer>();
		for(int i = 0 ; i < 5 ; i++)
		{
			lq.enqueue(i);
		}
		lq.yazdir();
		
		System.out.println();
		System.out.println(lq.dequeue());
		lq.yazdir();
		
		System.out.println();
		System.out.println(lq.getFirst());
		
		
		
		
	}

}
