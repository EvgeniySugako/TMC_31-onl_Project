package Homework_1;
/* В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
Например: n =26, в результате мы должны получить 8 (2+6) */

public class Task_2 {
    public static void main(String[] args) {
        double n = 26f; // объявление переменной n и назначение ее типа
        double one = n / 10; // объявление переменной one и назначение ее типа. Деление 26 на 10
        int oneX = (int) one;
        /* объявление переменной oneX и назначение ее типа.
        Преобразование в int результата вычисления переменной one */
        double two = n % 10;
        /* объявление переменной two и назначение ее типа.
        Остаток от деления n/10 */
        double sum = oneX + two; // объявление переменной sum и назначение ее типа. Сумма переменных oneX и two
        int SUMM = (int) sum; // объявление переменной SUMM и назначение ее типа. Преобразование double в int

        System.out.println(SUMM);
    }
}