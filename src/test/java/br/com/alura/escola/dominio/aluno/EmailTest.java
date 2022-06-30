package br.com.alura.escola.dominio.aluno;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
//		fail("Not yet implemented");
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
	}
	
	@Test
	void deveriaCriarEmailComEnderecoValido() {
		String emailStr = "diogocorrea@tecnomotor.com.br";
		Email email = new Email(emailStr);
		
		assertThat(emailStr, is(email.getEmail()));
	}

}
