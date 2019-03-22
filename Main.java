import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static double balanceSavings;
    public static double balanceChecking;

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<Account>();
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many checking accounts would you like to access today: 0, 1, or 2?");
        int countChecking = sc.nextInt();
        for (int i = 0; i < countChecking; i++)
            System.out.printf("Enter your eight-digit MemberID number: ");
            int IDNum = sc.nextInt();
        System.out.printf("Your current balance is $%.2f\n",balanceChecking); //need to add feature that tracks for balance each member number based on withdrawals and deposits
        accounts.add(new Checking(IDNum, balanceChecking));

        System.out.printf("\nHow many savings accounts would you like to access today: 0, 1, or 2?");
        int countSavings = sc.nextInt();
        for (int i = 0; i < countSavings; i++) {
            System.out.printf("Enter your eight-digit MemberID number: ");
            int IDNumE2 = sc.nextInt();
        System.out.printf("Your current balance is $%.2f\n",balanceSavings); //add balance feature
        accounts.add(new Savings(IDNumE2, balanceSavings));
        }
    }
}