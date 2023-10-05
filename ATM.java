import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 5000; // initial account balance
        int withdrawAmount, depositAmount;
        
        System.out.println("Welcome to XYZ Bank ATM");
        
        // Loop until the user selects 'Exit'
        while(true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            
            int option = input.nextInt();
            
            switch(option) {
                case 1: // Check balance
                    System.out.println("Your account balance is $" + balance);
                    break;
                case 2: // Withdraw
                    System.out.println("Enter amount to withdraw:");
                    withdrawAmount = input.nextInt();
                    if(withdrawAmount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("You have withdrawn $" + withdrawAmount);
                        System.out.println("Your new balance is $" + balance);
                    }
                    break;
                case 3: // Deposit
                    System.out.println("Enter amount to deposit:");
                    depositAmount = input.nextInt();
                    balance += depositAmount;
                    System.out.println("You have deposited $" + depositAmount);
                    System.out.println("Your new balance is $" + balance);
                    break;
                case 4: // Exit
                    System.out.println("Thank you for using XYZ Bank ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
