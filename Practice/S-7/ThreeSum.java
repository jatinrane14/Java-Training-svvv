import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] arguments){
        List<List<Integer>> lst = new ArrayList<>();
        int arr[] = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);

        for (int i = 0; i <= arr.length-3; i++) {
            if (i+1>arr.length && arr[i]==arr[i-1])continue;
            int l = i+1, r=arr.length-1,sum=0;
            while (l<r) {
                sum = arr[i]+arr[l]+arr[r];
                if (sum==0) {
                    lst.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    l++;
                    r--;
                    while (l<r && arr[l] == arr[l-1])l++;
                    while (r>l && arr[r]==arr[r+1])r--;
                }
                else if(sum>0) l++;
                else r--;
            }
        }
        System.out.println(lst);
    }   
}
