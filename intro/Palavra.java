public class Palavra {
  public static void main(String[] args) {
    // só tipos primitivos e básicos
    // primitivos: char, int, long, float, double, boolean
    // básico: String
    // será vetado o uso de ex. Math, métodos String
    // com exceção de toCharArray

    String s = "ifrs";
    int vogais = 0;
    int consoantes = 0;
    char[] letras = s.toCharArray();
    // System.out.println(java.util.Arrays.toString(letras));
    // System.out.println(letras);
    for (int i = 0; i < letras.length; i++) {
      if (letras[i] == 'a' || letras[i] == 'e'
          || letras[i] == 'i' || letras[i] == 'o'
          || letras[i] == 'u') {
        vogais++;
      }
    }
    System.out.println("Vogais: " + vogais);
    // Caso de Teste na forma de uma assertiva
    System.out.println(vogais == 1); // true
    System.out.println("Consoantes: " + consoantes);
    System.out.println(consoantes == 3);
  }
}
