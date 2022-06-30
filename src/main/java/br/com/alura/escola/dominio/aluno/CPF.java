package br.com.alura.escola.dominio.aluno;

// Value Object
public class CPF {
	private String numero;
	
	// desafio: teste unitário da classe CPF
	public CPF(String numero) {
		if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
			throw new IllegalArgumentException("CPF invalido!");
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
}
