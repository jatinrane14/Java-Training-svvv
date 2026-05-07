public class StringTut {
    public static void main(String[] args) {
        String s = "abc";
        String s2 = "Abc";
        System.out.println(s==s2);
        System.out.println(s.equals(s2.toLowerCase()));
        System.out.println(s2.compareTo(s));
        System.out.println(s.substring(1));
    }
}
