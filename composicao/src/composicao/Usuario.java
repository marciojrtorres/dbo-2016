package composicao;

public class Usuario {
	private String email, senha;
	// composição: usuário tem perfil
	private Perfil perfil = new Perfil();

	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() { return email; }
	public String getSenha() { return senha; }
	public Perfil getPerfil() { return perfil; }
	
	@Override
	public String toString() {
		return email + " " + senha + " " + perfil;
	}

}




