package entities.enums;

import exceptions.SimboloInexistenteException;

public enum ConversorSimbolo {
	MIL('M', 1000),
	QUIN ('D', 500),
	CEM ('C', 100),
	CINQ ('L', 50),
	DEZ ('X', 10),
	CINCO ('V', 5),
	UM ('I', 1);
	
	private Character simbolo;
	private Integer numero;

	ConversorSimbolo(Character simbolo, Integer numero) {
		this.simbolo = simbolo;
		this.numero = numero;
	}
	
	public static Integer retornaNumero(Character simbolo) {
		for(ConversorSimbolo cs : ConversorSimbolo.values()) {
			if(cs.getSimbolo().equals(simbolo)) {
				return cs.getNumero();
			}
		}
		throw new SimboloInexistenteException();
	}

	public Character getSimbolo() {
		return simbolo;
	}
	public Integer getNumero() {
		return numero;
	}
}
