class Pattern3{
    public static void main(String[] args) {
        int n =5;
        char c = 'A';
        char c2 = 'A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= 3; j++) {
                if (!(i%2==0)) {
                    if (j%2==0) {
                        System.out.print(c);
                        c++;
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    c2+=2;
                    System.out.print(c2);
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}