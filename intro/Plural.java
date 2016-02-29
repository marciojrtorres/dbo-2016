public class Plural {
  public static void main(String[] args) {
    // pl (tab)
    String palavra = "ogro";
    String plural = palavra + "s";
    // método endsWith de String
    if (palavra.endsWith("r")) {
      plural = palavra + "es";
    }
    if (palavra.endsWith("ão")) {
      plural = palavra.replace("ão", "ães");
    }
    System.out.println(plural); // ogros

    String palavra2 = "trator";
    String plural2 = palavra2 + "s";
    // método endsWith de String
    if (palavra2.endsWith("r")) {
      plural2 = palavra2 + "es";
    }
    if (palavra2.endsWith("ão")) {
      plural2 = palavra2.replace("ão", "ães");
    }
    System.out.println(plural2); // tratores

    String palavra3 = "pãe";
    String plural3 = palavra3 + "s";
    // método endsWith de String
    if  palavra3.endsWith("r")) {
      plural3 = palavra3 + "es";
    }
    if  palavra3.endsWith("ão")) {
      plural3 = palavra3.replace("ão", "ães");
    }
    System.out.println(plural3); // tratores



    // String palavra2 = "info";
    // char[] letras = palavra2.toCharArray();
    // // info   length == 4
    // // 0123
    // System.out.println(palavra2.charAt(palavra2.length() - 1));
    // System.out.println(letras[letras.length - 1]);

  }
}
