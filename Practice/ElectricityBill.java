import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total unit used: ");
        double unit = sc.nextDouble();
        double bill;
        if(unit <= 100){
            bill  = unit * 1.5;
        }else if(unit <=200){
            bill = (100 * 1.5) + ((unit - 100) * 3.5);
        }else{
            bill = (100 * 1.5) + 100* 3.5 + (unit - 200)*5;
        }
        bill+=50;
        if(bill>2000){
            double tenPerc = bill * 0.10;
            bill+= tenPerc;
        }

        System.out.println("Total Electricity bill is : " + bill);
        sc.close();
    }
}
