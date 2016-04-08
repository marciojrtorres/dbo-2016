public class OO8 {
  public static void main(String[] args) {
    // String é imutável
    String nome = "info";
    nome.toUpperCase();
    System.out.println(nome); // minúsculo
    String nome2 = nome.toUpperCase();
    System.out.println(nome2); // maiúsculo

    // Arrays/Vetores são objetos mutáveis
    int[] complexo = {2, 5};
    complexo[1] = complexo[1] + 1;
    System.out.println(
      java.util.Arrays.toString(complexo)); // [2,6]

    dobro(nome); // não altera a String
    System.out.println(nome); // infoinfo? não

    dobro(complexo);
    System.out.println(
      java.util.Arrays.toString(complexo)); // ?

  }

  public static void dobro(String s) {
    s = s + s;
  }

  public static void dobro(int[] vetor) {
    int i = 0;
    while (i < vetor.length) {
      vetor[i] = vetor[i] * 2;
      i++;
    }
  }

}
