import java.util.Scanner;

public class eg_21_Banking_Method {
    static Scanner input = new Scanner(System.in);
    public static void main (String [] args){


        //Java banking program for beginners

        //Declare a variable

        double balance = 0;
        boolean isRunning = true;
        int choice;

        //Display a menu

        while (isRunning) {

            System.out.println("Banking Program");
            System.out.println();
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();

            //Get and process users choice

            System.out.print("Enter your choice enter (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withDraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
            System.out.println();
            System.out.println("Thank you have a nice day");
        }




        //exit message

    }
    //Show balance

    static void showBalance(double balance){
        System.out.println();
        System.out.printf("$%.2f\n", balance);
        System.out.println();
    }

    //deposit

    static double deposit(){

        double amount;
        System.out.println();
        System.out.print("Enter an amount to be deposited: ");
        amount = input.nextDouble();
        if (amount < 0){
            System.out.println();
            System.out.println("Amount cant be negative");
            System.out.println();
            return 0;
        }
        else {
            return amount;
        }


    }

    //withdraw

    static double withDraw(double balance){

        double amount;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = input.nextDouble();

        if (amount > balance){
            System.out.println();
            System.out.println("Insufficient funds");
            System.out.println();
            return 0;
        }
        else if(amount < 0){
            System.out.println();
            System.out.println("Amount cant be negative");
            System.out.println();
            return 0;
        }
        else {
            return amount;
        }

    }
}
