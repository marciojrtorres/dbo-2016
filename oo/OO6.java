public class OO6 {
  public static void main(String[] args) {
    Fracao f1 = new Fracao();
    f1.numerador = 2;
    f1.denominador = 3;
    Fracao f2 = f1;
    System.out.println(f1.numerador); // 2
    System.out.println(f2.numerador); // 2
    System.out.println(f1 == f2); // true
    f2.numerador = 1;
    System.out.println(f1 == f2); // true
    System.out.println(f1.numerador); // 1
    System.out.println(f2.numerador); // 1
    Fracao f3 = null;
    System.out.println(f3); // null
    // System.out.println(f3.numerador); // essa linha quebra
    System.out.println("so far so good");

  }
}

class Fracao {
  int numerador;
  int denominador;
}
