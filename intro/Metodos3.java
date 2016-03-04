public class Metodos3 {
  // método que recebe um int e devolve um int
  //           devolve   (recebe)
  public static int dobro(int y) {
    return y + y;
  }

  public static void main(String[] args) {
    int n = 2;
    int b = dobro(n);
    System.out.println(n); // 2
    System.out.println(n == 2); // true
    System.out.println(b); // 4
    System.out.println(b == 4); // true
    int q = dobro(dobro(dobro(2)));
    System.out.println(q == 16);
  }
}
