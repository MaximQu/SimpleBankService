package banking.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Transaction {
    private TransactionType type;
    private LocalDateTime time;
    private int amount;

    public Transaction(TransactionType type, LocalDateTime time, int amount) {
        this.type = type;
        this.time = time;
        this.amount = amount;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public TransactionType getType() {
        return type;
    }

    public void setTime(LocalDateTime time) {
        this.time = time.truncatedTo(ChronoUnit.MILLIS);
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setAmount(int amount) {
        if (amount > 0) {
            System.out.println("Only positive numbers are allowed");
        } else {
            this.amount = amount;
        }
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Type: %s, Time: %s, Amount: %d".formatted(type, time, amount);
    }
}
