import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraySumEk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,-2,5,2};
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        HashMap<Integer,Integer> mp= new HashMap<>();
        int max=0,l=0,sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (sum==k && max<i+1) {
                max = i+1;
            }
            if (mp.containsKey(sum-k)) {
                max = max<(i-mp.get(sum-k))?i-mp.get(sum-k):max;
            }   
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
