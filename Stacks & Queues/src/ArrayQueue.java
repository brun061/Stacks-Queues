
public class ArrayQueue <T>{
	
	private T dizi [];
	private int basindex;
	private int sonindex;
	
	public int getBasindex() {
		return basindex;
	}
	public int getSonindex() {
		return sonindex;
	}
	
	public ArrayQueue()
	{
		dizi = (T[]) new Object[10];
		basindex = -1;
		sonindex = -1;
	}
	
	public boolean isEmpty()
	{
		return basindex == -1 && sonindex == -1;
	}
	
	public void addLast(T element)
	{
		if(isEmpty())
		{
			basindex++;
			sonindex++;
			
		}
		else if((sonindex == basindex-1) || (basindex == 0 && sonindex == dizi.length-1)) //dizi full demek
		{
			dizi=doubleCapacity(dizi);
			
		}
		else
		{
			sonindex = (sonindex + 1) % dizi.length;
		}
		dizi[sonindex] = element;

	}
	public T removeFirst()
	{
		T tmp= dizi[basindex];
		if(isEmpty())
		{
			return null;
		}
		
		dizi[basindex] = null;
		basindex = (basindex + 1) % dizi.length;
		return tmp;
	}
	public T getFirst()
	{
		if(isEmpty())
		{
			return null;
		}
		return dizi[basindex];
	}
	public T[] doubleCapacity(T array[])
	{
		T newarray[] ;
		newarray = (T[]) new Object[array.length*2];
		int tmp;
		tmp = basindex;
		
		for(int i = 0 ; i<array.length ; i++)
		{
			newarray[i] = array[(tmp) % array.length];
			tmp++;
		}
		
		basindex = 0;
		sonindex = array.length;
		
		return newarray;
		
		
	}
	public void yazdir()
	{
		System.out.print("[");
		for(int i = 0 ; i < dizi.length ; i++)
		{
			System.out.print(dizi[i]+", ");
		}
		System.out.print("]");
		
	}
	public int size()
	{
		return dizi.length;
	}
	
	public static void main(String[] args) {
		ArrayQueue<Integer> aq = new ArrayQueue<Integer>();
	
		for(int i = 0 ; i < 5 ; i++)
		{
			aq.addLast(i);
		}
		
		aq.removeFirst();
		
		System.out.println("Basindex: "+aq.getBasindex());
		System.out.println("Sonindex: "+aq.getSonindex());
		
		aq.yazdir();
	
		for(int i = 5 ; i < 11; i++)
		{
			aq.addLast(i);
		}
		aq.yazdir();
		System.out.println();
		System.out.println("Basindex: "+aq.getBasindex());
		System.out.println("Sonindex: "+aq.getSonindex());
		
		for(int i = 11 ; i < 15; i++)
		{
			aq.addLast(i);
		}
		
		aq.yazdir();
		System.out.println();
		System.out.println("Basindex: "+aq.getBasindex());
		System.out.println("Sonindex: "+aq.getSonindex());
		
		
	}
	
}
