public class LongestSubString {
    public static void main(String[] args) {
        int arr[] = {1,2,1,0,1,1,0,1};
        int k =4;
        int left=0,sum=0,max=0;
        for (int r = left; r < arr.length; r++) {
            sum+=arr[r];
       5     if(sum<=k && max<r-left+1){
                max= r-left+1;
            }
            while (sum>k) {
                sum-=arr[left];
                left++;
            }
            if(sum<=k&&max<r-left+1){
                max=r-left+1;
            }

        }
        System.out.println(max);
    }
}


