import java.util.Scanner;


public class Soru3 {
	
	public Soru3(String x)
	{
		ArrayStack<Character> as = new ArrayStack<Character>();
		String birler = "";
		String sifirlar = "";
		
		for(int i = 0 ; i< x.length(); i++)
		{
			as.push(x.charAt(i));
		}
		
		for(int i = 0 ; i< x.length() ; i++)
		{
			
			char cikan = as.pop();
			
			if(cikan == '1')
				birler = birler+"1";
			else
			{
				sifirlar = sifirlar+"0";
			}
				
		}
		
		System.out.println(x + " Stringindeki birler: " + birler.length());
		System.out.println(x + " Stringindeki sıfırlar: " + sifirlar.length());

		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("String Giriniz(1 ve 0 lardan oluşan): ");
		String input = s.nextLine();
		Soru3 deneme = new Soru3(input);

	}

}
