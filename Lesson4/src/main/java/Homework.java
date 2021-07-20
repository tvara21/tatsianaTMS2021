import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        System.out.println("Задача 1\n********");
//        ameba();

//        System.out.println("\nЗадача 2\n********");
//        System.out.println(summ(8, 6));
//        System.out.println(summ(7, 3));
//        System.out.println(summ(3, -1));
//        System.out.println();


//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *


//        System.out.println("\nЗадача 4\n********");
//        int number = -65;
//        analyzeNumber(number);

//        System.out.println("\nЗадача 5\n********");
//        reverseArray();

//        System.out.println("\nЗадача 6\n********");
//        maxArrayElement();

//        System.out.println("\nЗадача 7\n********");
//        replaceArrayElement();

//        System.out.println("\nЗадача 8\n********");
//        replaceMaxArrayElement();

//        System.out.println("\nЗадача 9\n********");
//        repeatingArrayElement();

        System.out.println("\nЗадача 10\n********");
        transposeMatrix();

    }


    //  1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    //  сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void ameba() {
        int i = 0;
        int cell = 1;
        while (i <= 21) {
            i += 3;
            cell = cell * 2;
            System.out.println(i + ": " + cell);
        }
    }


    //  2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
    //  умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        int result = 0;
        if (a != 0 || b != 0) {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            for (int i = 0; i < absB; i++) {
                result += absA;
            }
            if (a > 0 ^ b > 0) {
                result = -result;
            }

        }
        return result;
    }

    //  4) В переменную записываем число.
    //  Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    //  Например, Введите число: 5
    //  "5 - это положительное число, количество цифр = 1"
    private static void analyzeNumber(int number) {
        int figures = 1;
        int numberCut = number;
        while (numberCut / 10 != 0) {
            figures++;
            numberCut /= 10;
        }
        if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр: " + figures);
        } else if (number < 0) {
            System.out.println(number + " - это отрицательное число, количество цифр: " + figures);
        } else {
            System.out.println(number + " - это ноль. Не положительный и не отрицательный, количество цифр: " + figures);
        }


    }

    //  5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
    //  а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void reverseArray() {
        int number = 0;
        int index = 50;
        int[] array = new int[50];
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                number = i;
                index--;
                array[index] = number;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //  6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
    //  Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
    //  Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void maxArrayElement() {
        int[] mass = new int[12];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            mass[i] = random.nextInt(16);
            if (mass[i] >= max) {
                max = mass[i];
                index = i;

            }
        }
        System.out.println("Массив: " + Arrays.toString(mass));
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс его последнего вхождения в массив: " + index);
    }

    //  7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
    //  Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    //  Снова выведете массив на экран на отдельной строке.
    public static void replaceArrayElement() {
        int[] mass = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            mass[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    //  8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static void replaceMaxArrayElement() {
        int[] mass = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = Integer.MIN_VALUE;
        int index = 0;
        int temp = 0;
        System.out.println("Было: \t" + Arrays.toString(mass));
        for (int i = 0; i < 10; i++) {
            if (mass[i] >= max) {
                max = mass[i];
                temp = mass[i];
                index = i;

            }
        }
        mass[index] = mass[0];
        mass[0] = temp;
        System.out.println("Стало: \t" + Arrays.toString(mass));

    }


    //  9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
    //  Пример: {0,3,46,3,2,1,2}
    //  Массив имеет повторяющиеся элементы 3, 2
    //  Пример: {0,34,46,31,20,1,28}
    //  Массив не имеет повторяющихся элементов

    public static void repeatingArrayElement() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(11);
        }
        System.out.println("Массив: " + Arrays.toString(array));

    }

    //  10) Создаём квадратную матрицу, размер вводим с клавиатуры.
    //  Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
    //  Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
    //  Пример:
    //  1 2 3 4      1 6 3 1
    //  6 7 8 9      2 7 3 5
    //  3 3 4 5      3 8 4 6
    //  1 5 6 7      4 9 5 7
    public static void transposeMatrix() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число > 0");
        int size = console.nextInt();
        int array[][] = new int[size][size];
        int array1[][] = new int[size][size];

        Random random = new Random();

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                array[j][i] = random.nextInt(50);
                System.out.print(array[j][i] + "\t");

            }
            System.out.println();
        }
        System.out.println("\nТранспонированная матрица");

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                array1[j][i] = array[i][j];
                System.out.print(array1[j][i] + "\t");

            }
            System.out.println();
        }


    }

}