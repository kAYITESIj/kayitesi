class kally {
    public static void main(String[] args) {
      
   first:
        for( int a = 1; a < 5; a++) {

       second:
            for(int b = 1; b < 3; b++ ) {

                System.out.println("a = " + a + "; b = " +b);
       
             
                if ( a == 2)
                    break second;
            }
        }
    }
}