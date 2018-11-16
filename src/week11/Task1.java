package week11;

import java.util.Arrays;

public class Task1 {

    static <T> void sortArr(T[] a) {
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        String[] a = {"hung", "hoang", "huy", "Son", "Nam", "Duc", "Phuong"};
        sortArr(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }


}
