package application;

import entities.enums.ConversorSimbolo;

public class RomanoRegras {

	public String numeroRomano;
	public Integer numeroArabicoFinal = 0;

	public Integer converterEmArabico(String numeroRomano) {

		for (int i = 0; i < numeroRomano.length(); i++) {

			Character simbolo = numeroRomano.charAt(i);
			Character proxSimbolo = 0;
			Integer numeroArabicoAtual = ConversorSimbolo.retornaNumero(simbolo);
			Integer numeroArabicoProx = 0;

			if (i == numeroRomano.length() - 1) {
				proxSimbolo = 0;
				numeroArabicoProx = 0;
			} else {
				proxSimbolo = numeroRomano.charAt(i + 1);
				numeroArabicoProx = ConversorSimbolo.retornaNumero(proxSimbolo);

				if (numeroArabicoAtual < numeroArabicoProx) {
					numeroArabicoAtual *= -1;
				}
			}
			numeroArabicoFinal += numeroArabicoAtual;
		}

		return numeroArabicoFinal;
	}
}
