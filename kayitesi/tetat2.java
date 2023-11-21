class tetat2 {
  public static void main(String[] args) {

    first:
    for (int x = 1; x < 6; ++x) {

 
      for (int y = 1; y < 5; ++y) {
        if (x == 3 || y == 2)
          continue first;
        System.out.println("x = " + x + "; y = " + y);
      }
    }
  }
}