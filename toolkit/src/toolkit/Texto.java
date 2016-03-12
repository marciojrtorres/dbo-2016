package toolkit;

public class Texto {
  // Texto.corta("instituto federal", 9)
  // "instituto"
  public static String corta(String s, int q) {
    // converte string em char[]
    char[] letras = s.toCharArray();

    // condicional (para o caminho triste)
    // if (q > letras.length) q = letras.length;
    if (q > letras.length) return s;

    char[] retorno = new char[q];
    for (int i = 0; i < q; i++) {
      retorno[i] = letras[i];
    }
    // converte char[] em String
    return new String(retorno);
  }


  public static char up(char c) {
    if (c >= 97 && c <= 122) return (char) (c - 32);
    return c;
  }

}
// instituto federal
// 01234567890123456
// instituto
