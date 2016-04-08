package principal;

import tempo.Horario;

public class Main {
  public static void main(String[] args) {
    // tempo.Horario h = new tempo.Horario();
    // tempo.Horario h2 = new tempo.Horario();
    // Horario h = new Horario();
    // h.horas = 9;
    // h.minutos = 42;
    // h.segundos = 33;
    // argumentos para construtor (3 int's)
    Horario h = new Horario(9, 42, 33);
    System.out.println(h.horas);
    System.out.println(h.minutos);
    System.out.println(h.segundos);

    // se fosse Horario.adicionaHoras(1); // método estático da classe
    // h.adicionaHoras(1) // não é estático, é do obj
    // Horario h2 = adicionaHoras(h, 1);
    Horario h2 = h.adicionaHoras(1);
    System.out.println(h2.horas == 10); // 10
    System.out.println(h.horas  == 9);  // 9
    // 10:42:33 + 30 minutos = 11:12:33
    Horario h3 = h2.adicionaMinutos(30);
    System.out.println(h3.minutos == 12);
    System.out.println(h2.minutos == 42);
    // h2.minutos = 1000; // não deveria ser possível!
    // System.out.println(h2.minutos == 1000);
    Horario h4 = new Horario(29, 0, 0); // quebra
    System.out.println("essa linha não é executada");
    // System.out.println(h4.minutos == 70);
    // Fail-Fast (falha rápido)
    // Fail-Safe (seguro contra falhas)




  }
}
