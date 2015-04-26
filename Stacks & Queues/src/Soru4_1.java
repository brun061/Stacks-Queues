import java.util.Scanner;


public class Soru4_1 {
	public Soru4_1(String x)
	{
		ArrayStack<Character> arraystack = new ArrayStack<Character>();
		String push = "";
		for(int i = 0 ; i< x.length() ; i++)
		{
			if(x.charAt(i) != ' ')
			{
				arraystack.push(x.charAt(i));
				push = push+x.charAt(i);
				
			}
		}
		
		
		String pop = "";
		for(int i = 0 ; i<push.length() ; i++)
		{
			pop = pop + arraystack.pop();

		}
		
		if(pop.toString().equals(push.toString()))
		{
			System.out.println(x+" palindromdur.");
		}
		else
			System.out.println(x+" palindrom değildir.");

		
		

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("String giriniz:");
		String input = s.nextLine();
		Soru4_1 deneme = new Soru4_1(input);
	}

}
