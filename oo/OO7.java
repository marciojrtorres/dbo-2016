public class OO7 {
  public static void main(String[] args) {
    // manipular horários
    Horario h1 = new Horario();
    System.out.println(h1.horas); // 0
    System.out.println(h1.minutos); // 0
    System.out.println(h1.segundos); // 0
    System.out.println(h1.horas == 0); // 0
    System.out.println(h1.minutos == 0); // 0
    System.out.println(h1.segundos == 0); // 0
    h1.horas = 18;
    System.out.println(h1.horas); // 18
    System.out.println(h1.horas == 18); // 18

    Horario h2 = adicionaHoras(h1, 12);
    System.out.println(h1.horas == 18); // 18
    System.out.println(h2.horas == 18); // 6


  }
}
