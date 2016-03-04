public class Metodos2 {
  // método que executa uma ação:
  // imprimir o dobro de um número
  // por isso o "void"
  public static void dobro(int x) {
    System.out.println(x + x);
  }
  public static void main(String[] args) {
    int n = 7;
    dobro(n);
    dobro(3);
  }
}
