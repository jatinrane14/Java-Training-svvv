import java.util.Scanner;

public class CabFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ride distance: ");
        double distance = sc.nextDouble();
        int charges = 0;
        if (distance<=5) {
            charges = 5*50;
        }else if(distance<=10){
            charges = 5*50 + (int)(distance - 5)*40;     
        }else{
            charges = 5*50+5*40+ (int)(distance-10)*30;
        }

        System.out.println("is Night?(Y|N) : ");
        char isNight = sc.next().charAt(0);
        if(isNight == 'Y' || isNight =='y'){
            charges *= 1.2;
        }

        System.out.println("Total Cab Charges is: " + charges);
        sc.close();
    }
}
