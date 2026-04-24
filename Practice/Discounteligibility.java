import java.util.Scanner;

class Discounteligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Ammount: ");
        int ammount = sc.nextInt();

        if (ammount>=5000) {
            System.out.println("20% discount on " + ammount);
            ammount = (int)(ammount * 0.80);
        }else if(ammount >= 3000){
            System.out.println("10% discount on "+ammount);
            ammount = (int)(ammount * 0.90);
        }else{
            System.out.println("No Discount");
        }
        boolean isPremium = false;
        System.out.print("is premium user?(true|false) ");
        isPremium = sc.nextBoolean();

        if(isPremium){
            System.out.println("Giving Extra 5% discount as premium user  on ammount "+ammount);
            ammount = ammount - (int)(ammount * 0.05);
        }

        System.out.println("final Bill Ammount " + ammount);
    }
}