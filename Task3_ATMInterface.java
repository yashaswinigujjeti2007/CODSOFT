import java.util.Scanner;

public class Task3_ATMInterface {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 1000;
        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();

                    if(withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful.");
                    }
                    else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        input.close();
    }
}
