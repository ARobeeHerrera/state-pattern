public class Account {
    private String accountNumber;
    
    private Double balance;
    private AccountState accountState;


    public Account (String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }
    
    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void activate() {
        accountState.activate(this);
    }

    public void suspend() {
        accountState.suspend(this);
    }
    
    public void close() {
        accountState.close(this);
    }

    public void deposit(double d) {
        accountState.deposit(d, this);
    }

    public void withdraw(double d) {
        accountState.withdraw(d, this);
    }

    public String toString() {
        return "\nAccount Number: " + accountNumber + 
                "\nBalance:  " + balance ;
    }
}
