import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int total=0,trayNo;
        do{

            System.out.println("Tray1 (beverages)");
            System.out.println("Tray2 (snacks)");
            System.out.println("Tray3 (Chocolates)");
    
            System.out.println("Select your tray by using(1/2/3/0(Exit))");
            trayNo = sc.nextInt();
            switch (trayNo) {
                case 1:
                    {
                        char stay;
                        do{
                            System.out.println("a. Coca cola 40");
                            System.out.println("b. Maaza 20");
                            System.out.println("c. Sprite 30");
        
                            System.out.println("Selcet item to purchase");
                            char prod = sc.next().charAt(0);
        
                            if(prod=='a')
                                total+=40;
                            else if(prod=='b')
                                total+=20;
                            else
                                total+=30;
                            System.out.println("Stay on the tray");
                            stay = sc.next().charAt(0);
                        }while(stay!='n');
                        break;
                    }
                case 2:
                    {
                        char stay;
                        do{
                            System.out.println("a. Lays 10");
                            System.out.println("b. kurkure 20");
                            System.out.println("c. bakarwadi 60");
        
                            System.out.println("Selcet item to purchase");
                            char prod = sc.next().charAt(0);
        
                            if(prod=='a')
                                total+=10;
                            else if(prod=='b')
                                total+=60;
                            else
                                total+=30;
                            System.out.println("Stay on the tray");
                            stay = sc.next().charAt(0);
                        }while(stay!='n');
                        break;
                    }
                case 3:
                    {
                        char stay;
                        do{
                            System.out.println("a. Dairy milk 50");
                            System.out.println("b. Kit kat 20");
                            System.out.println("c. 30");
        
                            System.out.println("Selcet item to purchase");
                            char prod = sc.next().charAt(0);
        
                            if(prod=='a')
                                total+=50;
                            else if(prod=='b')
                                total+=20;
                            else
                                total+=30;
                            System.out.println("Stay on the tray");
                            stay = sc.next().charAt(0);
                        }while(stay!='n');
                        break;
                    }
                default:
                    break;
            }
        }while(trayNo!=0);
        System.out.println("Yout total bill is: " + total);
        sc.close();
    }
}