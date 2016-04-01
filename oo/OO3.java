public class OO3 {
  public static void main(String[] args) {
    Fracao f1 = new Fracao();
    f1.numerador = 2;
    // numerador é um atributo
    // acessado por ponto (.) no objeto
    f1.denominador = 3;

    Fracao f2 = new Fracao();
    f2.numerador = 3;
    f2.denominador = 5;

    Fracao f3 = mult(f1, f2);
    System.out.println(f3.numerador); // 6
    System.out.println(f3.denominador); // 15

    System.out.println(f1.numerador); // 2
    System.out.println(f1.denominador); // 3
  }

  public static Fracao mult(Fracao f1, Fracao f2) {
    Fracao r = new Fracao();
    r.numerador = f1.numerador * f2.numerador;
    r.denominador = f1.denominador * f2.denominador;
    return r;
  }

}

class Fracao {
  // ATRIBUTOS
  int numerador;
  int denominador;
}
// classe Fração com os atributos numerador e denominador
