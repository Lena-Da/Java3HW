//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            array.add(rand.nextInt(11));
        }
        System.out.println(array);
        System.out.println(Collections.min(array));
        System.out.println(Collections.max(array));
        int summa = 0;
        for (int i = 0; i < array.size(); i++){
            summa = summa+array.get(i);
        }
        double result = summa / array.size();
        System.out.println(result);
    }
}
