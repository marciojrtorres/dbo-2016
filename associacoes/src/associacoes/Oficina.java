package associacoes;

public class Oficina extends Atividade {
	private Curso curso;
	
	public Oficina(String descricao, Curso curso) {
		super(descricao, 10);
		this.curso = curso;
	}
	
	public Curso getCurso() {
		return curso;
	}

	@Override
	public String toString() {
		return this.curso + " " + super.toString();
	}
	
}







