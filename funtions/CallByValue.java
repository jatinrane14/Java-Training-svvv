class CallByValue{
    public static void add(int a,double b,String msg){
        double c = a+b;
        msg = "HELLO.......";
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a = 10;
        double b = 20.0;

        // CallByValue obj = new CallByValue();
        // obj.add(a, b);
        String str = new String("hello");
        add(a,b,str);

        System.out.print("a = "+a);
        System.out.print("b = "+b);
    }
}