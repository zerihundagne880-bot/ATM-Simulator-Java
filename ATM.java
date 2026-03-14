import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 1000.00; // መነሻ ሂሳብ
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- የኤቲኤም (ATM) አገልግሎት ---");
            System.out.println("1. ቀሪ ሂሳብ ማየት (Balance)");
            System.out.println("2. ገንዘብ ማስገባት (Deposit)");
            System.out.println("3. ገንዘብ ማውጣት (Withdraw)");
            System.out.println("4. መውጫ (Exit)");
            System.out.print("ምርጫዎትን ያስገቡ: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("ያለዎት ቀሪ ሂሳብ: $%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("የሚያስገቡትን መጠን ያስገቡ: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("ገንዘቡ በተሳካ ሁኔታ ገብቷል!");
                    break;
                case 3:
                    System.out.print("የሚያወጡትን መጠን ያስገቡ: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("ገንዘቡን መውሰድ ይችላሉ።");
                    } else {
                        System.out.println("ይህንን ለማውጣት በቂ ቀሪ ሂሳብ የለዎትም!");
                    }
                    break;
                case 4:
                    System.out.println("ስለተጠቀሙ እናመሰግናለን። ደህና ሁኑ!");
                    System.exit(0);
                default:
                    System.out.println("የተሳሳተ ምርጫ! እባክዎ እንደገና ይሞክሩ።");
            }
        }
    }
}

