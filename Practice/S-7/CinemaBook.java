import java.util.Scanner;
public class CinemaBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=7;
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0,c=0;
        for (int i = 0; i <n; i++) {
            if (arr[i]==0) {
                c++;
            }else if(c!=0){
                max= max<c?c:max;
                c=0;
            }
        }
        System.out.println("No. of Avaialabe consequitive seates "+max);
    }
}
