package Homework_5;
/*
Задача 1:
1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.
Задача 2:
Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String 8х8.
С помощью циклов задать элементам массива значения B(Black) или W(White).
При выводе результат работы программы должен быть следующим
Задача *:
Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
Формат входных данных: Программа получает на вход два числа n и m.
Формат выходных данных: Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3 символа
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1_3 {

    public static void main(String[] args) {

        arrayNew();
        getBoard();
        getSnake();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void arrayNew() {
        int[][] twoArray = new int[4][4]; // Создание объекта массив, с количеством элементов 4х4
        Random random = new Random(); // Создание объекта random
        int input; // Объявление переменной input
        for (int i = 0; i < twoArray.length; ++i) {
            for (input = 0; input < twoArray[i].length; ++input) {
                twoArray[i][input] = random.nextInt(10);
                // Условие циклического заполнения двухмерного массива
            }
        }
        System.out.println("Исходный массив: " + Arrays.deepToString(twoArray));
        // Вывод в консоль исходного двумерного массива
        System.out.print("Input number: "); // Ввод значение, которое нужно к элементам исходного массива
        Scanner inputNumber = new Scanner(System.in);
        input = inputNumber.nextInt();
        int[][] tempArray = Arrays.copyOf(twoArray, twoArray.length);
        // Копирование исходного массива
        int sum; // Объявление переменной sum
        int i; // Объявление переменной i
        for (sum = 0; sum < twoArray.length; ++sum) {
            for (i = 0; i < twoArray[sum].length; ++i) {
                twoArray[sum][i] += input;
                // Условие циклического заполнения двухмерного массива, с учетом суммы вводимого значение i
            }
        }
        System.out.println("Итоговый массив: " + Arrays.deepToString(tempArray));
        // Вывод в консоль итогового двумерного массива
        sum = 0;
        for (i = 0; i < twoArray.length; ++i) {
            for (int j = 0; j < twoArray[i].length; ++j) {
                sum += twoArray[i][j];
                // Условие циклической суммы всех элементов массива
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        // Вывод в консоль суммы элементов двумерного массива
    }

    public static void getBoard() {
        int size = 8; // Объявление и инициализация переменной size
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) { // Условие циклического заполнения двухмерного массива
                if ((i + j) % 2 == 0) { // Условие циклического заполнения символами
                    System.out.print(" W ");
                } else {
                    System.out.print(" B ");
                }
            }
            System.out.println();
        }

    }

    public static void getSnake() {
        System.out.print("Input n: "); // Ввод значения n
        int n = getScanner().nextInt();
        System.out.print("Input m: "); // Ввод значения m
        int m = getScanner().nextInt();
        int[][] arr = new int[n][m];

        int i; // Объявление переменной i
        int j; // Объявление переменной j
        for (int x = 0; x < n * m; arr[i][j] = x++) {
            i = x / m;
            j = i % 2 == 0 ? x % m : m - 1 - x % m;
        } // Условие циклического заполнения элементами массива

        System.out.println(Arrays.deepToString(arr)); // Вывод в консоль элементов двумерного массива
    }
}

