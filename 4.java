interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using UPI");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using Credit Card");
    }
}

class DebitCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using Debit Card");
    }
}

class OnlinePaymentSystem {
    public static void main(String[] args) {
        double amount = 5000;
        int choice = 2;

        Payment payment;

        switch (choice) {
            case 1 -> payment = new UPI();
            case 2 -> payment = new CreditCard();
            case 3 -> payment = new DebitCard();
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        payment.pay(amount);
    }
}