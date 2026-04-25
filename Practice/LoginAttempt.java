import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String demoUsername = "jatinrane";
        String demopass = "123456789";

        System.out.println("======Login Yout Account========");
        boolean isLoggedin = false;
        int loginAttemplt =0;
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        do {
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if(username.equals(demoUsername)  && password.equals(demopass)){
                System.out.println("Login successfull!");
                isLoggedin = true;
                break;
            }else{
                System.out.println("Username or password is incorrect!");
                loginAttemplt++;
            }
        } while (!isLoggedin && loginAttemplt<3);
        if (loginAttemplt >=3) {
            System.out.println("Account Locked!");
        }

        sc.close();
    }
}
