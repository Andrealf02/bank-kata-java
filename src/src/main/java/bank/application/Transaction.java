package bank.application;

import java.time.LocalDate;

public class Transaction {
    private final String date;
    private final int amount;

    public Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
