/*
Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его одним из двух способов: используя Math.random(),
или каждый элемент массива вводится пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:

Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).
Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив представляет целое число
(Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача добавить единицу к этому “числу” и на выходе получить
исправленный массив. Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
*/


package Homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

//        getOutputElements();
//        getMinMax();
//        getOutputMinMaxIndex();
//        getSearchNull();
//        getZamena();
        getComparison();


    }


    public static void getOutputElements() {
        System.out.print("Введите размера массива: "); // Ввод c клавиатуры размера массива
        Scanner size = new Scanner(System.in); // Создание объекта Scanner
        int sizeM = size.nextInt(); // Считывание данных объекта Scanner, присвоение значения переменной sizeM
        int[] nums = new int[sizeM]; // Создание объекта массив, с количеством элементов sizeM
        Random random = new Random(); // Создание объекта random
        for (int i = 0; i < sizeM; i++) { // Заполнение элементов массива случайными числами циклически
            nums[i] = random.nextInt(10); // Указание объекта и диапазона чисел
        }
        for (int f = 0; f < nums.length; f++) { // Условие циклического заполнения
            System.out.println("Index [" + f + "]: " + nums[f] + " "); // Задание формы вывода данных
        }
        System.out.println("Forward____________________________________________________");

        for (int f = nums.length - 1; f >= 0; f--) { // Условие циклического заполнения
            System.out.println("Index [" + f + "]: " + nums[f] + " "); // Задание формы вывода данных
        }
        System.out.println("Reverse____________________________________________________");
    }

    public static void getMinMax() {
        System.out.print("Введите размера массива: "); // Ввод c клавиатуры размера массива
        Scanner size = new Scanner(System.in); // Создание объекта Scanner
        int sizeM = size.nextInt(); // Считывание данных объекта Scanner, присвоение значения переменной sizeM
        int[] nums = new int[sizeM]; // Создание объекта массив, с количеством элементов sizeM
        Random random = new Random(); // Создание объекта random
        for (int i = 0; i < sizeM; i++) { // Заполнение элементов массива случайными числами циклически
            nums[i] = random.nextInt(10); // Указание объекта и диапазона чисел
        }
        int min = nums[0]; // Объявление переменной min, приравнивание ее, к 0 элементу массива
        for (int a = 0; a < nums.length; a++) { // Условие циклического заполнения
            if (min > nums[a]) { // При соблюдении условия
                min = nums[a]; // Выполнение действия
            }
        }
        System.out.println("Минимальное значение элемента массива: " + min);
        System.out.println("____________________________________________________");

        int max = nums[0]; // Объявление переменной max, приравнивание ее, к 0 элементу массива
        for (int b = 0; b < nums.length; b++) { // Условие циклического заполнения
            if (max < nums[b]) { // При соблюдении условия
                max = nums[b]; // Выполнение действия
            }
        }
        System.out.println("Максимальное значение элемента массива: " + max);
        System.out.println("____________________________________________________");

    }

    public static void getOutputMinMaxIndex() {
        Scanner size = new Scanner(System.in); // Создание объекта Scanner
        System.out.print("Введите размера массива: "); // Ввод c клавиатуры размера массива
        int sizeM = size.nextInt(); // Считывание данных объекта Scanner, присвоение значения переменной sizeM
        int[] nums = new int[sizeM]; // Создание объекта массив, с количеством элементов n
        Random random = new Random(); // Создание объекта random
        for (int i = 0; i < sizeM; i++) { // Заполнение элементов массива случайными числами циклически
            nums[i] = random.nextInt(10); // Указание объекта и диапазона чисел
        }

        System.out.println("Элементы массива без сортировки: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Элементы массива отсортированные " + Arrays.toString(nums));
        System.out.println("Элементы массива с минимальным значением " + nums[0]);
        System.out.println("Элементы массива с максимальным значением " + (nums.length - 1));
    }

    public static void getSearchNull() {
        int counter;
        int nums;
        int item;
        int[] array;
        Scanner input = new Scanner(System.in); // Создание объекта Scanner
        System.out.println("Введите размер массива: "); // Ввод c клавиатуры размера массива
        nums = input.nextInt();
        array = new int[nums]; // Создание объекта массив, с количеством элементов nums

        System.out.println("Введите " + nums + " числа"); // Заполнение элементов массива вводом с клавиатуры

        for (counter = 0; counter < nums; counter++) { // Условие циклического заполнения по размеру массива
            array[counter] = input.nextInt();
        }
        System.out.println(" ");

        item = 0;
        for (counter = 0; counter < nums - 1; counter++) {
            if (array[counter] == item) {
                item++;
                System.out.println("0 является " + (counter + 1) + " элементом в массиве");
            }
            if (counter == nums) {
                System.out.println("Элементы в массиве со значением 0 отсутствуют");
            }
        }
    }

    public static void getZamena() {
        System.out.print("Введите размер массива: "); // Ввод c клавиатуры размера массива
        Scanner size = new Scanner(System.in); // Создание объекта Scanner
        int nums = size.nextInt();
        int[] array = new int[nums];

        System.out.println("Введите " + nums + " числа"); // Заполнение элементов массива вводом с клавиатуры
        for (int i = 0; i < nums; i++) { // Заполнение элементов массива случайными числами циклически
            array[i] = size.nextInt(); // Указание объекта и диапазона чисел
        }
        System.out.println("Массив в исходном состоянии: " + Arrays.toString(array));
        for (int i = 0, j = (array.length - 1); i < j; i++, j--) {
            int Zamena = array[i];
            array[i] = array[j];
            array[j] = Zamena;
        }
        System.out.println("Массив с заменой элементов: " + Arrays.toString(array));
    }

    public static void getComparison() {
        System.out.print("Введите размер массива: "); // Ввод c клавиатуры размера массива
        Scanner size = new Scanner(System.in); // Создание объекта Scanner
        int nums = size.nextInt();
        int[] array = new int[nums];

        System.out.println("Введите " + nums + " числа"); // Заполнение элементов массива вводом с клавиатуры
        for (int i = 0; i < nums; i++) { // Заполнение элементов массива случайными числами циклически
            array[i] = size.nextInt(); // Указание объекта и диапазона чисел
        }

        boolean flag = true;
        for (int a = 1; a < array.length; a++) {
            if (array[a] <= array[a - 1]) {
                flag = false;
                break;
            }
            if (flag) {
                System.out.println("Массив является возрастающей последовательностью");
            } else {
                System.out.println("Массив не является возрастающей последовательностью");
            }
        }

    }
}




