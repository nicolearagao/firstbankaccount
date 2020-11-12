
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nicole
 */
public class UserInterface {

    private Account account;
    private Scanner scan;

    public UserInterface(Account account, Scanner scan) {
        this.account = account;
        this.scan = scan;
    }

    public void showMenu() {

        System.out.println("Hi there! Welcome " + account.getCustomerName() + "!");
        System.out.println("Your id number is:" + account.getCustomerId());

        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("A - Check your balance");
        System.out.println("B - Make a deposit");
        System.out.println("C - Make a withdrawal");
        System.out.println("D - View previous transaction");
        System.out.println("E - Calculate interest");
        System.out.println("F - exit");
        System.out.println("Enter an option:");
        while (true) {

            String answer = scan.nextLine();
            String answer1 = answer.toUpperCase();

            if (answer1.equals("F")) {
                System.out.println("****************************************");
                System.out.println("Thanks for being such a valuable customer to Nini bank.");
                break;
            }

            if (answer1.equals("A")) {
                System.out.println("****************************************");
                System.out.println("Balance = $ " + account.getBalance());
                System.out.println("****************************************");
                System.out.println("");
                continue;
            }

            if (answer1.equals("B")) {
                System.out.print("Enter an amount to deposit:");
                int amount = scan.nextInt();
                account.deposit(amount);
                System.out.println("");
                continue;
            }

            if (answer1.equals("C")) {
                System.out.print("Enter amount to withdraw:");
                int amount2 = scan.nextInt();

                try {
                    account.withdraw(amount2);

                } catch (NegativeBalanceException e) {
                    System.out.println("Not enough money in your account.");
                    System.out.println("Current Balance is:" + account.getBalance());
                    System.out.println("");

                }

                continue;
            }
            if (answer1.equals("D")) {

                System.out.println("****************************************");
                account.getPreviousTransaction();
                System.out.println("****************************************");
                System.out.println("");
                continue;
            }

            if (answer1.equals("E")) {

                System.out.println("Enter how many years of accrued interest:");
                int years = scan.nextInt();
                account.calculateInterest(years);
                System.out.println("");
                continue;

            }

        }

    }

}
