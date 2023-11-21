class  tetat {
  public static void main(String[] args) {

    int a = 1, b = 1;
    while (a <= 3) {

      System.out.println("Outer Loop: " + a);
      while(b <= 3) {

        if(b == 2) {
          b++;
          continue;
        }

        System.out.println("Inner Loop: " + b);
        b++;
      }
      a++;
    }
  }
}