public class OO5 {
  public static void main(String[] args) {
    // estado do objeto: como o objeto está!
    Fracao f1 = new Fracao();
    f1.numerador = 2;
    f1.denominador = 3;
    System.out.println(f1.numerador + "/" + f1.denominador);
    Fracao f2 = inverter(f1);
    System.out.println(f1.numerador + "/" + f1.denominador);
  }

  static Fracao inverter(Fracao f) {
    Fracao r = new Fracao();
    r.numerador = f.denominador;
    r.denominador = f.numerador;
    return r;
  }

}

class Fracao {
  // ATRIBUTOS
  int numerador;
  int denominador;
}
// classe Fração com os atributos numerador e denominador
