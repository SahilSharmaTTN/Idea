import java.util.Date;

public class Account {
    private String number;
    private String holderName;
    private double balance;
    private Date holderDob;
    private String holderGender;
    private Date accountCreated;

    public Account(String number, String holderName, double balance, Date holderDob, String holderGender, Date accountCreated) {
        this.number = number;
        this.holderName = holderName;
        this.balance = balance;
        this.holderDob = holderDob;
        this.holderGender = holderGender;
        this.accountCreated = accountCreated;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getHolderDob() {
        return holderDob;
    }

    public void setHolderDob(Date holderDob) {
        this.holderDob = holderDob;
    }

    public String getHolderGender() {
        return holderGender;
    }

    public void setHolderGender(String holderGender) {
        this.holderGender = holderGender;
    }

    public Date getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(Date accountCreated) {
        this.accountCreated = accountCreated;
    }
}
