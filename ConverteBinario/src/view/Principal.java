package view;

import controller.ConverteController;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		ConverteController cc = new ConverteController();
		int dec = inteiroValido();
		String bin = cc.decToBin(dec);
		
		System.out.println(dec + " em bin�rio = " + bin);
	}
	
	private static int inteiroValido()
	{
		Scanner s = new Scanner(System.in);
		String num;
		int n;
		
		while (true) {
			System.out.print("Insira um n�mero entre 0 e 1000: ");
			num = s.nextLine();
			try {
				n = Integer.parseInt(num);
			} catch (Exception e) {
				System.out.println("N�o � um n�mero! Digite novamente!");
				continue;
			}
			if (n >= 0 && n <= 1000)
				break;
			System.out.println("N�mero fora do intervalo! Digite novamente!");
		}
		s.close();
		return n;
	}
}