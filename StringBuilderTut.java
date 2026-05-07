public class StringBuilderTut {
    public static void main(String[] argsTut) {
        StringBuilder sb = new StringBuilder("Jatin");
        // sb.append("s");
        // sb.delete(0, 3);
        // sb.reverse();
        // sb.insert(2, 3);
        sb.setCharAt(2, 'y');
        sb.replace(0, 02, "Hello");
        System.out.println(sb);
    }
}
