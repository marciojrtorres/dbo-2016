package composicao;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Usuario u = 
			new Usuario("lucalippert@gmail.com", "1234");
		
		System.out.println(u);
		
		 // Perfil //
		u.getPerfil().setNome("Luca Lippert");
		u.getPerfil().setCidade("Rio Grande");
		// new Date() // é obsoleto // aparece tachado
		u.getPerfil().setDataNascimento(new Date(99, 7, 7));
		// navegação no grafo (na rede) de objeto
		u.getPerfil().addInteresse(Interesse.Cinema);
		u.getPerfil().addInteresse(Interesse.MaquinasAgricolas);

		System.out.println(u);
		
		u.getPerfil().removeInteresse(Interesse.Cinema);
		
		System.out.println(u);
		
		if (u.getPerfil() != null 
				&& u.getPerfil().getDataNascimento() != null) {
			
			System.out.println(u.getPerfil()
					.getDataNascimento().getMonth());
		}
	}
}






