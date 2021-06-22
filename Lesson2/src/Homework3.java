//Задача 3: Найти среднее значение из массива чисел
public class Homework3 {
    public static void main(String[] args) {
        int[] mass = {25, 59, 74, 658, -58};
        int count = mass.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += mass[i];
        }
        double avg = (double) sum / count;
        System.out.println("answer: среднее значение: " + sum + "/" + count + "=" + avg);


    }
}
