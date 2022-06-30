package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	// usando a interfce para abstrair e usar qualquer implementação 
	private final RepositorioDeAlunos repositorio;
	
	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	// lembra o padrão de projeto command: uma classe que executa uma ação
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}

}
