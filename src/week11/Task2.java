package week11;

import java.util.Arrays;

public class Task2 {
    static <T> T maxArr(T[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        String[] a = {"hung", "hoang", "huy", "Son", "Nam", "Duc", "Phuong"};
        String max = maxArr(a);
        System.out.println("Max Value of Array: " + max);
    }
}
