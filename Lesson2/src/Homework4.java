//Задача 4: Найти максимальный элемент в массиве
public class Homework4 {
    public static void main(String[] args) {
        int[] mass = {-89, 25, -69, 12, 4887, -698};
        int count = mass.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }

        System.out.println(max);
    }
}
