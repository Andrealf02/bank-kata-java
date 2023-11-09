import bank.application.Account;
import bank.application.Clock;
import bank.application.Transaction;
import org.junit.jupiter.api.Test;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;

public class AccountShould {
    private static final String DATE = "2012-01-12";
    private Account account;
    private Clock clock;
    private Transaction transaction;



    @Test
    void whenDepositThe1000eurosInTheBank() {

        Transaction deposit = new Transaction(DATE, 1000);

        account.deposit(1000);

        verify(transaction).add(equals(deposit));
    }

    @Test
    void whenDepositThe2000eurosInTheBank() {
        Transaction deposit = new Transaction();

        account.deposit(2000);

        verify(transaction).add(equals(deposit));
    }

    @Test
    void whenTheWithdraw2000eurosInTheBank() {
        Transaction withdraw = new Transaction(DATE, -500);

        account.withdraw(500);

        verify(transaction).add(equals(withdraw));
    }

    @Test
    void showAllTransactons() {
        Transaction showTransaction = new Transaction(DATE, 0);

        account.notifyAll();

        verify();
    }
}
