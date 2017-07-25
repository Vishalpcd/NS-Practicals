package Unit1;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String args[])
	{
		char c,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Plain text ");
		String PT=sc.next();
		PT=PT.replace(" ", "");
		PT=PT.toLowerCase();
		for(int i=0;i<PT.length();i++)
		{
			c=PT.charAt(i);
			if((int)c+3>122)
			{
				a=(char)(c+3-26);
			}
			else
			{
				a=(char)(c+3);
			}
			System.out.print(a);
		}
	}

}
