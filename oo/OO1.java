public class OO1 {
  public static void main(String[] args) {
    int[] f1 = {2, 5};
    int[] f2 = {3, 6};
    int[] f3 = mult(f1, f2);
    System.out.println(f3[0] == 6);
    System.out.println(f3[1] == 30);
  }

  static int[] mult(int[] f1, int[] f2) {
    // int[] r = {0, 0};
    int[] r = new int[2]; // objetos são construídos com um "new"
    r[0] = f1[0] * f2[0];
    r[1] = f1[1] * f2[1];
    return r;
    // return new int[] {f1[0] * f2[0], f1[1] * f2[1]};
  }
}
