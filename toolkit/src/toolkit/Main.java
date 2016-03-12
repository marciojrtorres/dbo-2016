package toolkit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Funciona!");
        System.out.println(Numero.soma(2, 3));

        String p1 = "instituto federal";
                   //01234567890123456
        String p2 = Texto.corta(p1, 9);
        System.out.println(p2); // instituto
        System.out.println(p2.equals("instituto"));

        String p3 = "ifrs";
        String p4 = Texto.corta(p3, 10);
        System.out.println(p4.equals("ifrs"));

        System.out.println(
          Texto.corta("ifrs", 2).equals("if"));

        System.out.println((int) 'a');
        System.out.println((char) 98);
        System.out.println((char) ('a' - 32));
        System.out.println((char) ('A' - 32));
        // String s1 = "ogro";
        // String s2 = Texto.up(s1);
        // System.out.println(s2); // OGRO
        // System.out.println(s2.equals("OGRO"));
        char c1 = 'b';
        char c2 = Texto.up(c1);
        System.out.println(c2 == 'B');

    }
}
