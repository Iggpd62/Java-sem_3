import java.util.ArrayList;
import java.util.List;
public class sem_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeIf(n -> n % 2 == 0);

        int min = list.stream().min(Integer::compareTo).orElse(0);

        int max = list.stream().max(Integer::compareTo).orElse(0);

        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Список после удаления четных чисел: " + list);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}