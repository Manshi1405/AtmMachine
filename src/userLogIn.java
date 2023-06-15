import java.util.HashMap;
import java.util.Scanner;

class Login {
    HashMap<Integer, Integer> details = new HashMap<>();

    Login() {
        details.put(123456, 123);
        details.put(19092002, 11819);
    }

    boolean authenticate(int account, int password) {
        if(details.containsKey(account))
            return details.get(account) == password;
        return false;
    }

}

class accountOption {
    void option() {
        int accountChoice=0;
        checking checkingAccount = new checking();
        saving savingAccount = new saving();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Select type of account:");
            System.out.println("1. Checking Account");
            System.out.println("2. Savings Account");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            accountChoice = sc.nextInt();
            switch (accountChoice) {
                case 1 -> checkingAccount.functionOption();
                case 2 -> savingAccount.functionOption();
                case 3 -> System.out.println("Thank-you for using ATM.\nHave a good day!\n");
                default -> System.out.println("Wrong Choice! Please enter the correct choice and try again.");
            }
        }while (accountChoice != 3);
    }
}
