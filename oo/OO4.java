public class OO4 {
  public static void main(String[] args) {
    // estado do objeto: como o objeto está!
    Fracao f1 = new Fracao();
    f1.numerador = 2;
    f1.denominador = 3;
    System.out.println(f1.numerador + "/" + f1.denominador);
    inverter(f1);
    System.out.println(f1.numerador + "/" + f1.denominador);
    System.out.println(f1.numerador + "/" + f1.denominador);
  }

  static void inverter(Fracao f) {
    int temp = f.numerador;
    f.numerador = f.denominador;
    f.denominador = temp;
  }

}

class Fracao {
  // ATRIBUTOS
  int numerador;
  int denominador;
}
// classe Fração com os atributos numerador e denominador
