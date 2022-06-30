package br.com.alura.escola.dominio.aluno;

import java.util.List;

/**
 * Como a camada de domínio não tem acesso à camada de aplicação e à camada de infraestrutura,
 * mas é necessário persistir os dados da camada de domínio então será criada uma interface
 * para indicar o que deve ser feito, mas as classes de fora que vão implementar esses métodos
 * O domínio não precisa se prender a detalhes de implementação, por isso interface aqui
 */
public interface RepositorioDeAlunos {

	/**
	 * Salva no banco de dados: utiliza a linguagem dos stakeholders e não da equipe técnica
	 */
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
}
