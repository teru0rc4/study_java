class sample02{
  public static void main(String[] args) {
    double a = 3.14;
    System.out.println(a);
    int b;
    // b = a <-これするとコンパイルエラー
    b = (int)a; // キャストしてやると, よいぞb
    System.out.println(b);
  }
}
