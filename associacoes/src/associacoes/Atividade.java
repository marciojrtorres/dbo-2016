package associacoes;
// new Atividade(); // proibido!
// Atividade é uma classe ABSTRATA
// Atividade não é uma classe CONCRETA
// Abstrato -> Incompleto
// Concreto -> Completo
// Abstrato -> Modelo básico, elementar, geral
// Concreto -> Implementação do modelo, específico
public abstract class Atividade {

	// atributos/campos
	private String descricao;
	private int vagas;
	
	private int slot = 0;
	
	// Uma Palestra pode ter vários participantes
	// **Palestra tem Participantes** --> AGREGAÇÃO
	// Palestra agrega Participantes
	private Participante[] participantes;

	public Atividade(String descricao, int vagas) {
		setVagas(vagas);
		setDescricao(descricao);
	}
	
	// comandos são void (geralmente)
	public void inscrição(Participante p) {
		if (getVagasDisponiveis() == 0) {
			throw new RuntimeException("lotado");
		}
//		for (int i = 0; i < participantes.length; i++) {
//			Participante existente = participantes[i];
//		}
		// for each (para cada)
		// para cada participante existente em participantes
		for (Participante existente : participantes) {
			// não se usa == para objetos
			// if (p == existente) {
			if (p.equals(existente)) {
				throw new RuntimeException("já inscrito");
			}
		}
		participantes[slot++] = p;
	}
	
	// get/set leitura/gravação
	public void setVagas(int vagas) {
		if (vagas < 5) {
			throw new IllegalArgumentException("min 5 vagas");
		}
		this.vagas = vagas;
		this.participantes = new Participante[vagas];
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getVagas() {
		return vagas;
	}

	@Override
	public String toString() {
		return descricao + " " + vagas + 
				java.util.Arrays.toString(participantes);
	}

	public int getVagasDisponiveis() {
		return this.vagas - this.slot;
	}


}












