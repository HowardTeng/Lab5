import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /***/
    public enum BankAccountType {
        /***/
        CHECKINGS,
        /***/
        SAVINGS,
        /***/
        STUDENT,
        /***/
        WORKPLACE
    }

    /***/
    private int accountNumber;
    /***/
    private BankAccountType accountType;
    /***/
    private double accountBalance;
    /***/
    private String ownerName;
    /***/
    private double interestRate;
    /***/
    private double interestEarned;
    /**
     * @param name n
     * @param accountCategory a
     * */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
    }
    /**@return */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**@return */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * @param newType */
    public void setAccountType(final BankAccountType newType) {
        this.accountType = newType;
    }
    /**
     * @param newBalance */
    public void setAccountBalance(final double newBalance) {
        this.accountBalance = newBalance;
    }
    /**@return */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * @param newName */
    public void setOwnerName(final String newName) {
        this.ownerName = newName;
    }
    /**@return */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * @param newRate */
    public void setInterestRate(final double newRate) {
        this.interestRate = newRate;
    }
    /**
     * @param newEarned */
    public void setInterestEarned(final double newEarned) {
        this.interestEarned = newEarned;
    }
    /**@return */
    public double getInterestEarned() {
        return interestEarned;
    }
}
