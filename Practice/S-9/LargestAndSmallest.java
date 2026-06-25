public class LargestAndSmallest{
    public static int SecondLargest(int[] arr){
       int largest = arr[0],secondLargest=Integer.MAX_VALUE;
       for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
       }
       return secondLargest;
    }
    public static int ThirdSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE,thirdSmallest=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if (smallest>arr[i]) {
                thirdSmallest = secondSmallest;
                secondSmallest=smallest;
                smallest = arr[i];
            }else if (arr[i] < secondSmallest && arr[i]!=smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = arr[i];
            }else if(arr[i]<thirdSmallest && arr[i]!=secondSmallest && arr[i]!=smallest){
                thirdSmallest = arr[i];
            }
        }
        return thirdSmallest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println("Second Largest: "+SecondLargest(arr));
        System.out.println("Third Smallest: "+ThirdSmallest(arr));
    }
}