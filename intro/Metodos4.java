public class Metodos4 {
  // API: assinatura do método:
  // especificação do que entra e o que sai
  // repete(int,String):String
  // significa entra int e String e sai String
  public static String repete(int n, String s) {
    String r = "";
    for (int i = 0; i < n; i++) r += s;
    return r;
  }

  public static void main(String[] args) {
    String s = "##";
    int n = 10;
    String r = repete(n, s);
    System.out.println(r); // ####################
    System.out.println(r.equals("####################"));
  }
}
