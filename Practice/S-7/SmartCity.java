public class SmartCity {
    public static void main(String[] args) {
        int arr[] = {4,8,15,3,10,12,5,9};
        int k = 3;
        int left = 0;
        int right=k-1;

        int max =0;
        for (int i = left; i <=right; i++) {
            System.out.print("i = "+ i);
            System.out.println();
            // System.out.print(arr[i]);
            right++;
            left++;
            if (right==7) {
                break;
            }
        }

        System.out.println(max);
    }
}
