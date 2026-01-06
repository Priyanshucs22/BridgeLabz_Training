import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedList;
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class pair{
    int amount;
    String summary;
    public pair(int amount, String summary){
        this.amount = amount;
        this.summary = summary;
    }
}

class WalletService {
    private static HashMap<Integer, Integer> wallets = new HashMap<>();
    private static LinkedList<pair> transactionHistory = new LinkedList<>();
    public static void createWallet(int id) {
        if (wallets.containsKey(id)) {
            System.out.println("Wallet already exists!");
            return;
        }
        wallets.put(id, 0);
        System.out.println("Wallet created with ID: " + id);
    }

    public static void addMoney(int id, int amount) {
        checkWallet(id);
        wallets.put(id, wallets.get(id) + amount);
        transactionHistory.add(new pair(amount,"Added Money to wallet ID: " + id));
        System.out.println("Money added successfully.");
    }

    public static void withdrawMoney(int id, int amount) {
        checkWallet(id);
        int balance = wallets.get(id);
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        wallets.put(id, balance - amount);
        transactionHistory.add(new pair(-amount, "Withdrawn Money from wallet ID: " + id));
        System.out.println("Money withdrawn successfully.");
    }

    public static void transferMoney(int senderId, int receiverId, int amount) {
        checkWallet(senderId);
        checkWallet(receiverId);

        int senderBalance = wallets.get(senderId);
        if (senderBalance < amount) {
            throw new InsufficientBalanceException("Insufficient balance to transfer!");
        }

        wallets.put(senderId, senderBalance - amount);
        wallets.put(receiverId, wallets.get(receiverId) + amount);
        transactionHistory.add(new pair(-amount, "Transferred Money from wallet ID: " + senderId + " to wallet ID: " + receiverId));
        System.out.println("Money transferred successfully.");
    }

    public static int getBalance(int id) {
        checkWallet(id);
        return wallets.get(id);
    }

    private static void checkWallet(int id) {
        if (!wallets.containsKey(id)) {
            throw new InsufficientBalanceException("Wallet ID not found!");
        }
    }
    public static LinkedList<pair> getTransactionHistory() {
        return transactionHistory;
    }
}

public class UserWallet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Wallet");
            System.out.println("2. Add Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Check Balance");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Wallet ID: ");
                        WalletService.createWallet(sc.nextInt());
                        break;

                    case 2:
                        System.out.print("Wallet ID: ");
                        int idAdd = sc.nextInt();
                        System.out.print("Amount: ");
                        WalletService.addMoney(idAdd, sc.nextInt());
                        break;

                    case 3:
                        System.out.print("Wallet ID: ");
                        int idWithdraw = sc.nextInt();
                        System.out.print("Amount: ");
                        WalletService.withdrawMoney(idWithdraw, sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Sender ID: ");
                        int sender = sc.nextInt();
                        System.out.print("Receiver ID: ");
                        int receiver = sc.nextInt();
                        System.out.print("Amount: ");
                        WalletService.transferMoney(sender, receiver, sc.nextInt());
                        break;

                    case 5:
                        System.out.print("Wallet ID: ");
                        int idBalance = sc.nextInt();
                        System.out.println("Balance: " + WalletService.getBalance(idBalance));
                        break;

                    case 6:
                        System.out.println("Thank you!");
                        sc.close();
                        System.exit(0);

                    case 7:
                        LinkedList<pair> history = WalletService.getTransactionHistory();
                        System.out.println("Transaction History: " + history);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}