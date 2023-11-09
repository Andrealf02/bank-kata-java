package bank.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transactions {
    private Clock clock;
  public List<Transaction> transactionsList= new ArrayList<>();
    public void add(int amount) {
        Transaction deposit = new Transaction(clock.dateAsString(), amount);
        transactionsList.add(deposit);
    }

    public List<Transaction> all() {
        return Collections.unmodifiableList(transactionsList);
    }

    public void withdraw(int amount) {
        Transaction deposit = new Transaction(clock.dateAsString(), -amount);
        transactionsList.add(deposit);
    }
}
