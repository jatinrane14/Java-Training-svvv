class pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n*2-1; i++) {
            if (i<=n) {
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2*i-1; k++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 1; j <=i-n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=2*( 2*n-i)-1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    int dogeking=7;
}