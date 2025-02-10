public class ActiveState implements AccountState{

    @Override
    public void deposit(Double depositAmount, Account account){
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposited: " + depositAmount + account);
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdraw: " + withdrawAmount + account);
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed");
        account.setAccountState(new ClosedState());
    }

    public void suspend(Account account) {
        System.out.println("Account is suspended");
        account.setAccountState(new SuspendedState());

    }

    @Override
    public void activate(Account account) {
       System.out.println("Account is already activated");
    }

}
