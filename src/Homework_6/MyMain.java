package Homework_6;

public class MyMain {
    public static void main(String[] args) {
        CreditCard OneCreditCard = new CreditCard("One credit card", 1000);
        CreditCard TwoCreditCard = new CreditCard("Two credit card", 2000);
        CreditCard ThreeCreditCard = new CreditCard("Three credit card", 3000);

        OneCreditCard.addMoney(100);
        TwoCreditCard.addMoney(200);
        ThreeCreditCard.withdrawalMoney(88);

        OneCreditCard.printInfo();
        TwoCreditCard.printInfo();
        ThreeCreditCard.printInfo();

    }
}
