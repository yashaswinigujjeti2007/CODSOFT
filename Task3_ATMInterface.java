import java.util.Scanner;

public class Task3_ATMInterface {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double accountBalance = 1000;
        int userChoice;

        System.out.println("===== Welcome to My ATM Machine =====");

        do {

            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Account Balance");
            System.out.println("2. Add Money");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");

            System.out.print("Please enter your choice: ");
            userChoice = input.nextInt();

            switch(userChoice) {

                case 1:
                    System.out.println("Your current balance is: ₹" + accountBalance);
                    break;

                case 2:
                    System.out.print("Enter amount to add: ₹");
                    double depositAmount = input.nextDouble();
                    accountBalance += depositAmount;
                    System.out.println("Money added successfully.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = input.nextDouble();

                    if(withdrawAmount <= accountBalance) {
                        accountBalance -= withdrawAmount;
                        System.out.println("Please collect your cash.");
                        System.out.println("Withdrawal completed successfully.");
                    } else {
                        System.out.println("Sorry, insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using My ATM.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while(userChoice != 4);

        input.close();
    }
}
