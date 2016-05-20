package composicao;

import java.util.Arrays;
import java.util.Date;

public class Perfil {
	private String nome;
	private String cidade;
	private Date dataNascimento;
	private Interesse[] interesses = new Interesse[5]; // plural

	public Interesse[] getInteresses() {
		return interesses;
	}
	
	public void addInteresse(Interesse interesseAAdicionar) {
		for (int i = 0; i < interesses.length; i++) {
			if (interesses[i] == null) {
				interesses[i] = interesseAAdicionar;
				break;
			}
		}
	}
	
	public void removeInteresse(Interesse interesseARemover) {
		for (int i = 0; i < interesses.length; i++) {
			if (interesseARemover.equals(interesses[i])) {
				interesses[i] = null;
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Perfil [nome=" + nome 
			+ ", cidade=" + cidade
			+ ", dataNascimento=" + dataNascimento 
			+ ", interesses=" + Arrays.toString(interesses) + "]";
	}

}







