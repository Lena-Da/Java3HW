//Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            array.add(rand.nextInt(11));
        }
        System.out.println(array);
        int count = 0;
        while (count<array.size()){
            if (array.get(count)% 2 == 0)
            array.remove(count);
            else count++;
        }
         System.out.println(array);
    }        
    }



