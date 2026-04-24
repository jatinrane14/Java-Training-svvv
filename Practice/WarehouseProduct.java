import java.util.Scanner;

public class WarehouseProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of product: ");
        int n = sc.nextInt();

        int productStock[] = new int[n];
        int productReq[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter current stock of product ID " + (i+1));
            productStock[i] = sc.nextInt();
            System.out.println("Enter the minimumm requirement of the product");
            productReq[i] = sc.nextInt();
        }
        int restockCount =0;
        for (int i = 0; i < productReq.length; i++) {
            if(productStock[i] < productReq[i]){
                restockCount++;
                System.out.println("Required " + (productReq[i] -productStock[i]) + " for the product "+ (i+1));
            }
        }

        System.out.println(restockCount+" number of required to be restock");
        sc.close();
    }
}
