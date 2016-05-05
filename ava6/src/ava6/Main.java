package ava6;

public class Main {

	public static void main(String[] args) {
		
		// construtores vazio
		Date d = new Date();
		// data mínima
		System.out.println(d.day == 1);
		System.out.println(d.month == 1);
		System.out.println(d.year == 1900);
		/*
		d = new Date(2000, 12, 25);
		System.out.println(d.day == 25);
		System.out.println(d.month == 12);
		System.out.println(d.year == 2000);

		// as linhas a seguir devem causar exceção na hora de compilar
		// pois o tipo Date deve ser imutável, comente-as após garantir isso
		d.day = 5;
		d.month = 1;
		d.year = 2001;
		// ----------- até aqui 0.2 pts

		// deve ser indiferente a posição do ano, apenas o mês é fixo no meio
		d = new Date(13, 7, 2016);
		System.out.println(d.day == 13);
		System.out.println(d.month == 7);
		System.out.println(d.year == 2016);

		// os construtores a seguir devem lançar IllegalArgumentException
		// após fazer lançar a exceção comente as linhas para não parar a execução
		// inválido (ambíguo)
		d = new Date(1900, 7, 2016);
		// inválido (ano abaixo do mínimo 1900)
		d = new Date(16, 7, 1899);
		// inválido (ano abaixo do mínimo 1900)
		d = new Date(1899, 7, 16);
		// inválido (mês inválido)
		d = new Date(2016, 13, 16);
		// inválido (dia inválido)
		d = new Date(2016, 12, 32);
		// inválido (dia inválido)
		d = new Date(2016, 12, -1);
		// inválido (mês inválido)
		d = new Date(2016, -1, 16);
		// inválido (dia inválido)
		d = new Date(2016, 2, 30);
		// até aqui 0.4 pts

		// toString
		Date d8 = new Date(5, 5, 2005);
		System.out.println(d8.toString().equals("05/05/2005"));
		d8 = new Date(1, 10, 2001);
		System.out.println(d8.toString().equals("01/10/2001"));
		// até aqui 0.6

		// comparações
		Date d5 = new Date(1, 7, 2014);
		Date d6 = new Date(1, 7, 2014);
		System.out.println(d5.equals(d6) == true);
		System.out.println(d5.equals(new Date()) == false);

		Date d7 = new Date(23, 4, 2016);
		System.out.println(d5.after(d7) == false);
		System.out.println(d7.after(d5) == true);
		System.out.println(d5.before(d7) == true);
		System.out.println(d7.before(d5) == false);
		System.out.println(d7.before(d7) == false);
		System.out.println(d7.after(d7) == false);
		// até aqui 0.8

		// plusDays, minusDays, tomorrow e yesterday
		d = new Date(2016, 4, 22);
		Date d2 = d = d.yesterday();
		System.out.println(d2.day == 21);
		System.out.println(d2.month == 4);
		System.out.println(d2.year == 2016);
		// lembrando que é imutável
		System.out.println(d.day == 22);
		System.out.println(d.month == 4);
		System.out.println(d.year == 2016);

		d2 = d.tomorrow();
		System.out.println(d2.day == 23);
		System.out.println(d2.month == 4);
		System.out.println(d2.year == 2016);

		Date d3 = d2.plusDays(10);
		System.out.println(d3.day == 3);
		System.out.println(d3.month == 5);
		System.out.println(d3.year == 2016);

		Date d4 = d3.minusDays(10);
		System.out.println(d4.day == 23);
		System.out.println(d4.month == 4);
		System.out.println(d4.year == 2016);
		// até aqui 1.0 pts

		// situações complexas
		Date q = new Date(20, 2, 2016);
		q = q.plusDays(9);
		System.out.println(q.toString().equals("29/02/2016"));
		for (int i = 0; i < 400; i++) q = q.tomorrow();
		System.out.println(q.toString().equals("04/04/2017"));
		q = q.plusDays(365);
		System.out.println(q.toString().equals("04/04/2018"));
		// até aqui 1.2 pts

		Implementar objeto Conjunto (1.3 pts)

		O objeto Conjunto armazena um vetor de inteiros, permitindo realizar operações relacionadas.

		Cosidere os seguintes Casos de Teste:

		int[] semRepetidos = {1, 4, 6, 2, 9};
		// valores repetidos devem ser ignorados
		int[] comRepetidos   = {1, 4, 6, 2, 9, 1, 4};

		Conjunto c1 = new Conjunto(semRepetidos);
		System.out.println(c1.cardinalidade() == 5);
		c1 = new Conjunto(comRepetidos);
		System.out.println(c1.cardinalidade() == 5);
		c1 = new Conjunto(new int[] {3, 9});
		System.out.println(c1.cardinalidade() == 2);
		c1 = new Conjunto();
		System.out.println(c1.cardinalidade() == 0);
		// ----- até aqui 0.2

		// construtor com intervalo inclusivo nas duas pontas
		c1 = new Conjunto(2, 7); // {2,3,4,5,6,7}
		System.out.println(c1.cardinalidade() == 6);
		c1 = new Conjunto(7, 2); // {}
		System.out.println(c1.cardinalidade() == 0);
		c1 = new Conjunto(7, 7); // {7}
		System.out.println(c1.cardinalidade() == 1);
		// ----- até aqui 0.4

		// consultas
		Conjunto a = new Conjunto(new int[]{2, 4, 6});
		Conjunto b = new Conjunto(new int[]{1, 2, 3});
		Conjunto c = new Conjunto();
		Conjunto d = new Conjunto(new int[]{0});
		Conjunto e = new Conjunto(new int[]{2, 4});

		System.out.println(a.vazio() == false);
		System.out.println(c.vazio() == true);

		System.out.println(a.unitario() == false);
		System.out.println(c.unitario() == false);
		System.out.println(d.unitario() == true);

		System.out.println(a.pertence(1) == false);
		System.out.println(a.pertence(2) == true);

		System.out.println(a.contem(b) == false);
		System.out.println(a.contem(e) == true);
		System.out.println(a.contem(d) == false);
		System.out.println(a.contem(c) == true);

		System.out.println(b.estaContido(a) == false);
		System.out.println(e.estaContido(a) == true);
		System.out.println(d.estaContido(a) == false);
		System.out.println(c.estaContido(a) == true);
		// ----- até aqui 0.6

		// equals e toString
		Conjunto v = new Conjunto();
		Conjunto u = new Conjunto(new int[]{2});
		Conjunto n = new Conjunto(new int[]{3,7,9});
		Conjunto m = new Conjunto(new int[]{9,7,3}); // a ordem não importa

		System.out.println(v.toString().equals("{}"));
		System.out.println(u.toString().equals("{2}"));
		System.out.println(n.toString().equals("{3,7,9}"));

		System.out.println(n.equals(v) == false);
		System.out.println(n.equals(m) == true);
		System.out.println(v.equals(v) == true);

		Conjunto e = new Conjunto(new int[]{1,3,1,3,4,5,7,8});
		System.out.println(e.toString().equals("{1,3,4,5,7,8}"));
		// ------------- até aqui 0.8

		Conjunto i = new Conjunto(new int[]{1,3,5});
		Conjunto p = new Conjunto(new int[]{2,4,6});
		Conjunto h = new Conjunto(new int[]{5,6,7,8});

		Conjunto r = i.uniao(p);
		System.out.println(r.toString().equals("{1,3,5,2,4,6}"));
		r = p.uniao(i);
		System.out.println(r.toString().equals("{2,4,6,1,3,5}"));

		System.out.println(i.uniao(p).equals(p.uniao(i)));

		r = i.interseccao(p);
		System.out.println(r.vazio() == true);
		System.out.println(r.toString().equals("{}"));

		r = i.interseccao(h);
		System.out.println(r.vazio() == false);
		System.out.println(r.toString().equals("{5}"));

		r = i.diferenca(p);
		System.out.println(r.toString().equals("{1,3,5}"));
		r = i.diferenca(h);
		System.out.println(r.toString().equals("{1,3}"));

		System.out.println(i.toString().equals("{1,3,5}"));
		System.out.println(p.toString().equals("{2,4,6}"));
		System.out.println(h.toString().equals("{5,6,7,8}"));
		// ------- até aqui 1.0


		// casos complexos
		Conjunto q1 = new Conjunto(new int[]{1,3,1,6,8});
		Conjunto q2 = new Conjunto(new int[]{2,4,6,1,2});
		Conjunto q3 = new Conjunto(new int[]{3,1,5,5,8});

		Conjunto q4 = q1.uniao(q2, q3);
		System.out.println(q4.toString().equals("{1,3,6,8,2,4,5}"));
		q4 = q1.interseccao(q2, q3);
		System.out.println(q4.toString().equals("{1}"));
		q4 = q1.interseccao(q1); // elimina as duplicatas
		System.out.println(q4.toString().equals("{1,3,6,8}"));
		q4 = q1.diferenca(q1);
		System.out.println(q4.toString().equals("{}"));
		System.out.println(q4.vazio() == true);
		System.out.println(q4.cardinalidade() == 0);
		// ----------- até aqui 1.3
		*/
		// http://marciojrtorres.github.io/
		
	}

}
