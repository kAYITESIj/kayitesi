class kally2 {
    public static void main(String[] args) {
    
        first:
        for( int d = 2; d < 6; d++) {
            second:
            for(int c = 2; c < 4; c++ ) {
                System.out.println("d = " + d + "; c = " +c);
             
                if ( d == 2)
                    break first;
            }
        }
    }
}