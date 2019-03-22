public class Checking extends Account{

    protected double balanceChecking;
    int customer;

    Checking(int newCustomer, double newBalance) {
        int customer = newCustomer;
        double balanceChecking= newBalance;
        //System.out.printf("Account %d created.\n\n", customer);
    }

    //add method for deposit

    //add method for withdrawal

    public void editBalance(double amount) {
        balanceChecking += amount;

    }
}