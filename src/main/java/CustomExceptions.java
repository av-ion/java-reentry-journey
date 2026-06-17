public class CustomExceptions {
    public static void withdraw(double balance,double amount) {
        if(amount <0)
            throw new IllegalArgumentException("Amount cannot be negative");
        if(amount > balance)
            throw new InsufficientFundsException("Insufficient Funds");


        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance : "+(balance-amount));

    }
}
