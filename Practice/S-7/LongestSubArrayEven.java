public class LongestSubArrayEven {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,0,1,0,1};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        if(sum%2==0){
            System.out.println("");
            return;
        }
        int left=0,max=0;

        
        System.out.println(max);
    }
}


