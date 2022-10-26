import java.util.Arrays;
import java.util.Random;

//Реализовать алгоритм сортировки слиянием

public class task1 {

    public static void main(String[] args) {
        int[] arr = randArr();
        System.out.println(Arrays.toString(sort(arr, 0, 7)));

    }

    static int[] randArr() {
        Random rand = new Random();
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = rand.nextInt(11);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    static void merge(int[] array, int a, int b, int c) {
        int arrLength1 = b - a + 1;
        int arrLength2 = c - b;

        int[] newArr1 = new int[arrLength1];
        int[] newArr2 = new int[arrLength2];

        for (int i = 0; i < arrLength1; ++i) {
            newArr1[i] = array[a + i];
        }
        for (int j = 0; j < arrLength2; ++j) {
            newArr2[j] = array[b + 1 + j];
        }

        int i = 0, j = 0;
        int d = a;
        while (i < arrLength1 && j < arrLength2) {
            if (newArr1[i] <= newArr2[j]) {
                array[d] = newArr1[i];
                i++;
            } else {
                array[d] = newArr2[j];
                j++;
            }
            d++;
        }

        while (i < arrLength1) {
            array[d] = newArr1[i];
            i++;
            d++;
        }
        while (j < arrLength2) {
            array[d] = newArr2[j];
            j++;
            d++;
        }
    }

    static int[] sort(int[] array, int a, int c) {
        if (a < c) {
            int b = (a + c) / 2;
            sort(array, a, b);        
            sort(array, b + 1, c);      
            merge(array, a, b, c);      
        }
        return array;
    }
}