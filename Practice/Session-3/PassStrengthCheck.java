import java.util.*;

public class PassStrengthCheck {
    public static boolean checkPassword(String pass){
        if((pass.length()>=8)){
            if(pass.matches(".*\\d.*")){
                if(pass.matches(".*[A-Z].*")){
                    if (pass.matches(".*[^a-zA-Z0-9].*")) {
                        return true;
                    }else{
                        System.out.println("Password must contains at least one Special character");
                    }
                }else{
                    System.out.println("Password must contains at least one Capital letter");
                }
            }else{
                System.out.println("Password must contains at least one digit");
            }
        }else{
            System.out.println("Please enter at least 8 characters!");
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (checkPassword(pass)) {
            System.out.println("Valid Password");
        }else{
            System.out.println("InValid Password");
        }

        sc.close();
    }
}
