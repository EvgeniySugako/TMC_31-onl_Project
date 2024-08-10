package Homework_3;
/*
Задача 1. Напишите программу, которая будет принимать на вход число из консоли и на выход будет выводить сообщение
четное число или нет. Для определения четности числа используйте операцию получения остатка
от деления (операция выглядит так: '% 2').

Задача 2. Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

Задача 3. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

Задача 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

Задача *. Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
ввести некорректные данные.
 */

import java.util.Scanner;

public class Task_from_1_to_5 {
    public static void main(String[] args) {

        getEnterNumber();
        getWeather();
        getSquare();
        getLoop();
        getDop();
    }

    public static void getEnterNumber() {
        System.out.print("Введите число: ");
        Scanner getNumber = new Scanner(System.in);
        int number = getNumber.nextInt();
        if (number % 2 == 1) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }
        System.out.println("_________________________________________________");
    }

    public static void getWeather() {
        System.out.print("Введите температуру: ");
        Scanner getTemperature = new Scanner(System.in);
        int Temperature = getTemperature.nextInt();
        if (Temperature > -5) {
            System.out.println("Warm");
        } else if (Temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        System.out.println("_________________________________________________");
    }

    public static void getSquare() {
        for (int counter = 10; counter <= 20; counter++) {
            System.out.println("Counter * counter: " + counter * counter);
        }
        System.out.println("_________________________________________________");
    }

    public static void getLoop() {
        int value = 7;
        while (value <= 98) {
            System.out.println("Value: " + value);
            value = value + 7;

        }
        System.out.println("_________________________________________________");
    }

    public static void getDop() {
        System.out.print("Введите любое положительное число: ");
        Scanner getNum = new Scanner(System.in);
        int num = getNum.nextInt();
        int summ = 0;
        if (num > 0) {
            for (int count = 1; count <= num; count++) {
                summ = summ + count;
            }
        } else {
            System.out.println("Введенные данные некорректны");
        }
        System.out.println("Сумма чисел от 1 до введенного числа: " + summ);

    }

}

