package bank.application;

import bank.AccountService;

public class Account implements AccountService {
    private final Clock clock;
    private final Transactions transactions;

    public Account(Clock clock, Transactions transactions) {
        this.clock = clock;
        this.transactions = transactions;
    }

    public void deposit(int amount) {
        Transaction deposit = new Transaction(clock.dateAsString(), amount);
        transactions.add(deposit.getAmount());
    }

    @Override
    public void withdraw(int amount) {
        Transaction deposit = new Transaction(clock.dateAsString(), amount);
        transactions.withdraw(deposit.getAmount());
    }

    @Override
    public void printStatement() {
        return;
    }

}
