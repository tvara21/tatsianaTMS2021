public class Homework {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println("Задание 1 (сумма двух чисел): " + sum(100, 200));
        System.out.println("Задание 2 (сумма двух чисел, дополнительно): " + sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println("Задание 3 (максимальное значение из двух чисел): " + max(56, 349));
        System.out.println("Задание 4 (среднее значение из массива чисел): " + average(new int[]{0, -2, 3, -1, 8}));
        System.out.println("Задание 5 (максимальый элемент массива): " + max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println("Задание 6 (значение гипотенузы): " + calculateHypotenuse(3, 4));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        if ((long) a + (long) b > Integer.MAX_VALUE) {
            return -1;
        } else {
            return a + b;
        }
    }

    /**
     * 3. Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * 4. Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        int count = array.length;
        double sum = 0;
        for (int i = 1; i < count; i++) {
            sum += array[i];
        }
        return sum / count;
    }

    /**
     * 5. Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int count = array.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 6. Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}