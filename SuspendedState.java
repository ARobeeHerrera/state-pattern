public class SuspendedState implements AccountState{

    @Override
    public void deposit(Double depositAmount, Account account){
        System.out.println("You can't deposit on a suspended account");
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You can't withdraw on a suspended account");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is activated");
        account.setAccountState(new ActiveState());
    }

    public void suspend(Account account) {
        System.out.println("Account is already Suspended");
    }

    @Override
    public void close(Account account) {
       System.out.println("Account is closed");
       account.setAccountState(new ClosedState());
    }

}
