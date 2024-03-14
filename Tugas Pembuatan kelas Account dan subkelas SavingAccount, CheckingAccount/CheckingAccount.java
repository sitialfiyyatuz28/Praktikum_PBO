/**
 *
 * @author julhan
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public CheckingAccount(double balance) {
        this(balance, -1.0); // Default overdraftProtection is -1.0 indicating no protection
    }

    @Override
    public boolean withdraw(double jumlah) {
        if (balance - jumlah >= 0) {
            balance -= jumlah;
            return true;
        } else {
            double overdraftNeeded = jumlah - balance;
            if (overdraftProtection == -1.0 || overdraftProtection < overdraftNeeded)
                return false;
            else {
                balance = 0.0;
                overdraftProtection -= overdraftNeeded;
                return true;
            }
        }
    }
}

