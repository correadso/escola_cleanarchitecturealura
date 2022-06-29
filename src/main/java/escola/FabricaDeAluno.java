package escola;

// lembra também o padrão Builder por causa do encadeamento dos métodos
public class FabricaDeAluno {
	
	private Aluno aluno;
	
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this; // útil para utilizar encadeamento das chamadas dos métodos
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
	/**
	 * Demonstrando a criação de um Aluno usando a fábrica/builder de Aluno
	 */
	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		Aluno aluno2 = fabrica.comNomeCPFEmail("Diogo", "12345678900", "email@email.com")
		.comTelefone("12", "123456789")
		.comTelefone("34", "987654321")
		.criar();
	}

}
