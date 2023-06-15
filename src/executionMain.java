import java.util.Scanner;

public class executionMain {
    public static void main(String[] args) {
        Login l = new Login();
        accountOption accountOption = new accountOption();
        Scanner sc = new Scanner(System.in);
        int account,password;
        System.out.println("\n--------------------------Welcome to HR Bank----------------------\n");
        System.out.print("Enter account number: ");
        account = sc.nextInt();
        System.out.print("Enter password: ");
        password = sc.nextInt();
        if(l.authenticate(account,password)) {
            accountOption.option();
        }
        else
            System.out.println("Wrong Username Or Password Please Try Again!");
    }
}
