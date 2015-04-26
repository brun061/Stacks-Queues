
public class ArrayStack <T> {
	private int topindex;
	private T stack[];
	
	public ArrayStack()
	{
		stack = (T[]) new Object [10];
		topindex = -1;
	}
	public ArrayStack(T[] n)
	{
		if(n.length > stack.length)
		{
			stack = doubleCapacity(stack);	
		}
		for(int i = 0 ; i<n.length; i++)
		{
			stack [i] = n[i];
		}
		
	}
	public void push (T element)
	{
		topindex++;
		if(topindex >= stack.length )
		{
			stack = doubleCapacity(stack);		
		}
		stack[topindex]=element;
		
	}
	public T peek ()
	{
		if(!isEmpty())
		{
			return stack[topindex];
		}
		return null;
		
	}
	public T pop ()
	{
		T tmp = null;
		if(!isEmpty())
		{
			tmp = stack[topindex];
			stack[topindex]=null;
			topindex--;
		}
		
		return tmp;
		
	}
	
	public boolean isEmpty()
	{	
		return topindex < 0;
		
	}
	
	public void yazdir()
	{
		System.out.print("[");
		for(int i = 0 ; i < stack.length ; i++)
		{
			System.out.print(stack[i]+", ");
		}
		System.out.print("]");
		
	}
	
	public T[] doubleCapacity(T array[])
	{
		T newarray[] ;
		newarray = (T[]) new Object[array.length*2];
		
		for(int i = 0 ;i<array.length ; i++)
		{
			newarray[i] = array[i];
		}
		
		return newarray;
		
		
	}
	public static void main(String[] args) {
		ArrayStack<Integer> as = new ArrayStack<Integer> ();
		
		for(int i = 0 ; i < 10 ; i++)
		{
			as.push(i);
		}
		as.yazdir();
		System.out.println();
		System.out.println(as.pop());
		
		as.yazdir();
		
		for(int i = 9 ; i < 16 ; i++)
		{
			as.push(i);
		}
		System.out.println();
		as.yazdir();
		System.out.println();
		System.out.println(as.peek());
	}
}

