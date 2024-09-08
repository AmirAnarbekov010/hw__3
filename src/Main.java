//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаем массив дробных чисел
        double[] numbers = {8.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 5.0, 1.0, -3.0, 4.0, 2.0, 0.5, -1.5, 3.0};

        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        
        if (firstNegativeIndex != -1) {
            double sum = 0.0;
            int count = 0;

            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                    count++;
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
            } else {
                System.out.println("Нет положительных чисел после первого отрицательного числа.");
            }
        } else {
            System.out.println("Отрицательные числа не найдены в массиве.");
        }
    }
}