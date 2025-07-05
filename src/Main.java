import service.BankAccountService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountService();
        String[] options = {"deposit", "withdraw", "balance", "history", "exit"};

        do {
            System.out.println("Choose an operation one of: ");

            for (String option : options) {
                System.out.println("\t" + option);
            }

            Scanner scanner = new Scanner(System.in);
            String userOption = scanner.nextLine();

            if (userOption.equals("deposit")) {
                int value = getInt();
                bankAccountService.depositMoney(value);
            }

            if (userOption.equals("withdraw")) {
                int value = getInt();
                bankAccountService.withdrawMoney(value);
            }

            if (userOption.equals("history")) {
                bankAccountService.printTransactionHistory();
            }

            if (userOption.equals("balance")) {
                bankAccountService.printBalance();
            }

            if (userOption.equals("exit")) {
                break;
            }
        }

        while (true);
        System.out.print("Session successfully closed, see you latter <3");
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Valid value must be number! ");
            }
        }
    }
}