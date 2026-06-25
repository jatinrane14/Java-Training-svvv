import java.util.ArrayList;
import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arLs= new ArrayList<>();
        int elem = -1;
        while (elem!=0) {
            elem = sc.nextInt();
            arLs.add(elem);
        }
        int sum=0;
        for (Integer num : arLs) {
            sum += num;
        }
        System.out.println(sum);
        // System.out.println(arLs.getFirst());
    }
}
