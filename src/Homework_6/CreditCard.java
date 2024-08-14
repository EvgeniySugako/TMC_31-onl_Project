package Homework_6;

/*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод, который позволяет начислять
сумму на кредитную карточку. Добавьте метод, который позволяет снимать с карточки некоторую сумму. Добавьте метод,
который выводит текущую информацию о карточке. Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма. Тестовый сценарий для проверки: Положите деньги на первые две карточки
и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

public class CreditCard {
    String accountNumber;
    int accountMoney;

    public CreditCard(String accountNumber, int accountMoney) {
        this.accountNumber = accountNumber;
        this.accountMoney = accountMoney;
    }

    public void addMoney(int money) {
        this.accountMoney += money;
    }

    public void withdrawalMoney(int money) {
        this.accountMoney += money;
    }

    public void printInfo() {
        System.out.println("Your account number: " + accountNumber + ". How money to account: " + accountMoney);
    }
}
