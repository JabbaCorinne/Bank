public class Savings extends Account{
    protected double balanceSavings;
    int customer;

    Savings(int newCustomer, double newBalance) {
        int customer = newCustomer;
        double balanceSavings = newBalance;
        //System.out.printf("Account %d created.\n", customer);
    }

    //add method for deposit

    //add method for withdrawal

    public void editBalance(double amount) {
        balanceSavings += amount;


    }
}