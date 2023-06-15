import java.util.Scanner;

class negativeAmountException extends Exception {
    public String toString() {
        return "Amount entered cannot be NEGATIVE or  0";
    }
}

class withdrawBiggerException extends Exception {
    public String toString() {
        return "Withdrawal Amount Cannot be greater than amount";
    }
}
class functioning {
    int balance = 0;
    int viewBalance() {
        return balance;
    }

    void withdraw() throws negativeAmountException, withdrawBiggerException {
            int withdrawAmount;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: Rs ");
            withdrawAmount = sc.nextInt();
            if(withdrawAmount <= 0)
                throw new negativeAmountException();
            if(withdrawAmount > balance)
                throw new withdrawBiggerException();
            balance -= withdrawAmount;
            System.out.println("Rs "+withdrawAmount+" withdrawal successful!");
            System.out.println("New Account balance: Rs "+balance);


    }

   void deposit() throws negativeAmountException {
        int depositAmount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: Rs ");
        depositAmount = sc.nextInt();
        if(depositAmount <=0)
            throw new negativeAmountException();
        balance+=depositAmount;
        System.out.println("Rs "+depositAmount+" deposited successfully!");
        System.out.println("New Account balance: Rs "+balance);

    }
}

class checking {

    functioning checkingFunction = new functioning();
    void functionOption() {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nChecking account: ");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Checking Account Balance: Rs " + checkingFunction.viewBalance());
                case 2 -> {
                    try{checkingFunction.withdraw();}
                    catch (negativeAmountException | withdrawBiggerException ne) {
                        System.out.println(ne);
                    }
                }
                case 3 -> {
                    try{
                        checkingFunction.deposit();
                    }catch (negativeAmountException nae){
                        System.out.println(nae);
                    }
                }
                case 4 -> System.out.println("Thank-you for using ATM.\nHave a good day!\n");
            }
        }while (choice!=4);

    }
}

class saving {

    functioning savingFunction = new functioning();
    void functionOption() {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nSavings account: ");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Savings Account Balance: Rs " + savingFunction.viewBalance());
                case 2 -> {
                    try{savingFunction.withdraw();}
                    catch (negativeAmountException | withdrawBiggerException nwe) {
                        System.out.println(nwe);
                    }
                }
                case 3 -> {
                    try{
                        savingFunction.deposit();
                    }catch (negativeAmountException nae){
                        System.out.println(nae);
                    }
                }
                case 4 -> System.out.println("Thank-you for using ATM.\nHave a good day!");
            }
        }while (choice!=4);

    }
}