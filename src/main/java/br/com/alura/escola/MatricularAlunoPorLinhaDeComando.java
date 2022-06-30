package br.com.alura.escola;

import br.com.alura.escola.aplicacao.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {

		String nome = "Diogo";
		String cpf = "123.123.123-00";
		String email = "fulano@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
	}

}
