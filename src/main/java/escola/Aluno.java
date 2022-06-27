package escola;

import java.util.ArrayList;
import java.util.List;

// entidade, pois dois objetos distintos devem ter um identificador único
public class Aluno {

	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
}
