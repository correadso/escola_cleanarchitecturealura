package escola;

public class Email {
	private String endereco;

	// value object, não é uma entidade, pois se tem os mesmos valores representam a mesma coisa
	public Email(String endereco) {
		if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail inválido");
		}
		this.endereco = endereco;
	}
	public String getEmail() {
		return this.endereco;
	}
}
