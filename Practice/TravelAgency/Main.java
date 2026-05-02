import java.util.Scanner;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

   public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    // Getters
    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

}

public class Main{
    public static int findAgenciesWithHighestPackage(TravelAgencies[] arr){
        int max = 0;
        for (TravelAgencies t : arr) {
            if (t.getPrice() > max) {
                max = t.getPrice();
            }
        }
        return max;
    }
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType){
        for (TravelAgencies t : arr) {
            if (t.getRegNo() == regNo &&
                t.getPackageType().equalsIgnoreCase(packageType) &&
                t.isFlightFacility()) {

                return t;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        TravelAgencies arr[] = new TravelAgencies[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Reg no:");
            int regNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Agency Name:");
            String agencyName = sc.nextLine();
            System.out.println("Enter Agency Package Type:");
            String packageType = sc.nextLine();
            System.out.println("Enter Price:");
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            arr[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
            System.out.println();
        }


        System.out.println("-----------------------Input--------------------------");
        System.out.println("Enter Agency Reg no.");
        int regNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Package Type: ");
        String packageType = sc.nextLine();
        System.out.println("------------Output------------");
        int highestPrice = findAgenciesWithHighestPackage(arr);
        System.out.println("Highest Pagckage is: "+highestPrice);

        TravelAgencies result = agencyDetailsForGivenIdAndType(arr, regNo, packageType);

        if (result != null) {
            System.out.println(result.getAgencyName());
            System.out.println(result.getPrice());
        } else {
            System.out.println("No agency found");
        }

        sc.close();
    }
}