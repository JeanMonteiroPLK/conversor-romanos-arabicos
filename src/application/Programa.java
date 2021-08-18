package application;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número romano: ");
		String numeroRomano = sc.nextLine();
		System.out.print("Correspondente em arábicos: " + new RomanoRegras().converterEmArabico(numeroRomano));
		
		sc.close();
	}
}
