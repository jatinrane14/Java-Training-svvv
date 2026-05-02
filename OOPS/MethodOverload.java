public class MethodOverload {
    static int add(int a , int b){
        return a+b;
    }
    static int add(double a , double b){
        return (int)(a+b);
    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10.1,20.2));
    }
}
