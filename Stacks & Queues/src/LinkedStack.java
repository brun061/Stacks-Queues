


public class LinkedStack <T>{
	
	private Node topNode;
	
	public LinkedStack()
	{
		topNode = null;
	}
	public void push(T element)
	{
		Node newNode = new Node(element);
		if(isEmpty())
		{
			 newNode.previous = null;
			 newNode.next = null;
			 topNode = newNode;
		}
		else
		{
			topNode.next = newNode;
			newNode.previous = topNode;
			newNode.next = null;
			topNode = newNode;
		}
			
	}
	public T peek()
	{
		if(!isEmpty())
		{
			return topNode.element;
		}
		return null;
	}
	
	public T pop()
	{
		Node tmp = topNode;
		if(!isEmpty())
		{
			topNode.previous.next = null;
			topNode = topNode.previous;
			topNode.previous = null;
			
			return tmp.element;
		}
		
		return null;
		
	}
	public boolean isEmpty()
	{
		return topNode == null;
	}
	
	private class Node
    {
		public Node(T e) {
			element = e;
		}
		private T element; 
    	private Node next;
    	private Node previous;
    }
	
	public static void main (String [] args)
	{
		LinkedStack<Integer> ls = new LinkedStack<Integer>();
		
		for(int i = 0 ; i < 5 ; i++)
		{
			ls.push(i);
		}
		System.out.println(ls.peek());
		System.out.println(ls.pop());
		System.out.println(ls.peek());

	}

}
