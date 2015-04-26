import java.util.Scanner;


public class Soru4_2 {
	public Soru4_2(String x)
	{
		ArrayStack<Character> arraystack = new ArrayStack<Character>();
		ArrayQueue<Character> arrayqueue = new ArrayQueue<Character>();
		String push = "";
		for(int i = 0 ; i< x.length() ; i++)
		{
			if(x.charAt(i) != ' ')
			{
				arraystack.push(x.charAt(i));
				push = push+x.charAt(i);
				
			}
		}
		
		String removefirst = "";
		for(int i = 0 ; i< push.length() ; i++)
		{
			arrayqueue.addLast(arraystack.pop());
			
		}
		for(int i = 0 ; i< push.length() ; i++)
		{
			removefirst = removefirst + arrayqueue.removeFirst();
		
		}
		
		if(push.toString().equals(removefirst.toString()))
		{
			System.out.println(x + " palindromdur.");
		}
		else
			System.out.println(x + " palindrom değildir.");
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("String giriniz:");
		String input = s.nextLine();
		Soru4_2 deneme = new Soru4_2(input);

	}

}
