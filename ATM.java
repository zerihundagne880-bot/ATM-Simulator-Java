import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 1000.00; // Starting Balance
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- ATM Services ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            // Check if input is an integer to prevent crashes
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number (1-4).");
                sc.next(); // Clear the invalid input
                continue;
            }

            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: $%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully deposited!");
                    } else {
                        System.out.println("Invalid amount. Deposit must be positive.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    sc.close(); // Good practice to close the scanner
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
