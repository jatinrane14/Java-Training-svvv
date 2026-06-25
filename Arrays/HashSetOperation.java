import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetOperation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Set<Integer> st = new HashSet<>();
        int ele =  sc.nextInt();
        while (ele!=0) {
            st.add(ele);
            ele = sc.nextInt();
        }
        for (Integer integer : st) {
            System.out.println(integer);
        }
    }
}
