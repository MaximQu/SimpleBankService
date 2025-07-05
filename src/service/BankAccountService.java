package service;

import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    private int money = 0;
    private final List<String> operationHistory = new ArrayList<>();

    public void depositMoney(int value) {
        money += value;
        operationHistory.add("deposit: " + value);
    }

    public void withdrawMoney(int value) {
        if (value > money) {
            System.out.println("Not enough money");
        } else {
            money -= value;
            operationHistory.add("withdraw: " + value);
        }
    }

    public void printTransactionHistory() {
        System.out.println("Here is your transaction history: ");

        for (String option : operationHistory) {
            System.out.println("\t" + option);
        }
    }

    public void printBalance() {
        System.out.println("Current balance is: " + money);
    }
}
