
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(-3));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        calculateSumOfDiagonalElements();
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Задание 1
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное целое число");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не целое число!!!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Задание 2
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        System.out.println("\nЗадание 2");
        if (number > 0) {
            return ++number;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }

    /**
     * Задание 3
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        System.out.println("\nЗадание 3");
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Задание 4
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        System.out.println("\nЗадание 4");
        int c100 = count % 100;
        int c10 = c100 % 10;
        if (c100 >= 11 && c100 <= 19) {
            System.out.println(count + " программистов");
        } else if (c10 >= 2 && c10 <= 4) {
            System.out.println(count + " программиста");
        } else if (c10 == 1) {
            System.out.println(count + " программист");
        } else {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Задание 5
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        System.out.println("\nЗадание 5");
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        }
    }

    /**
     * Задание 6
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        System.out.println("\nЗадание 6");
        int size = 4;
        int[][] matrix = new int[size][size];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = random.nextInt(1000);
                System.out.print(value + " ");
                if (i == j) {
                    sum += value;
                }
            }
            System.out.println();
        }
        System.out.println("Сумма = " + sum);
    }


    /**
     * Задание 7
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        System.out.println("\nЗадание 7");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите высоту матрицы");
        int height = scanner.nextInt();
        System.out.println("Введите ширину матрицы");
        int width = scanner.nextInt();

        if (height > 0 & width > 0) {
            int[][] matrix = new int[height][width];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(1000);
                }
            }
            for (int[] row : matrix) {
                for (int element : row) {
                    if (element % 3 == 0) {
                        System.out.print("+ ");
                    } else if (element % 7 == 0) {
                        System.out.print("- ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("unavailable values");
        }
    }

    /**
     * Задание 8
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        System.out.println("\nЗадание 7");
        int currentNumber = 1;
        ArrayList<Integer> foundPrimes = new ArrayList<Integer>();
        checkingPrimes:
        while (currentNumber < 1000) {
            currentNumber++;
            for (int prime : foundPrimes) {
                if (currentNumber % prime == 0) {
                    continue checkingPrimes;
                }
            }
            foundPrimes.add(currentNumber);
        }
        System.out.println(foundPrimes.toString());
    }
}
