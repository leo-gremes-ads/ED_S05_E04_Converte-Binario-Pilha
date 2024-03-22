package controller;

import lib.model.PilhaInt;

public class ConverteController
{
	public ConverteController()
	{
		super();
	}
	
	public String decToBin(int dec)
	{
		PilhaInt restos = new PilhaInt();
		String bin = "";
		
		if (dec == 0) return "0";
		while (dec >= 1) {
			restos.push(dec % 2);
			dec /= 2;
		}
		while (true) {
			try {
				bin += String.valueOf(restos.pop());
			} catch (Exception e) {
				break;
			}
		}
		return bin;
	}
}
