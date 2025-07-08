package service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    private int bankAccount = 0;
    private final List<Transaction> operationHistory = new ArrayList<>();

    public void depositMoney(int value) {
        if (value > 0) {
            bankAccount += value;
            operationHistory.add(new Transaction(TransactionType.DEPOSIT, LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS), value));
        } else {
            System.out.println("Only positive numbers are allowed");
        }
    }

    public void withdrawMoney(int value) {
        if (value > bankAccount) {
            System.out.println("Not enough money");
        } else {
            bankAccount -= value;
            operationHistory.add(new Transaction(TransactionType.WITHDRAW, LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS), value));
        }
    }

    public void printTransactionHistory() {

        if (!operationHistory.isEmpty()) {
            System.out.println("Here is your transaction history: ");

            for (Transaction transaction : operationHistory) {
                System.out.println(transaction.toString());
            }
        } else {
            System.out.println("No transaction history");
        }
    }

    public void printBalance() {
        System.out.println("Current balance is: " + bankAccount);
    }
}
