package week10;

import java.util.Random;

public class Task2 {
    static Random rd = new Random();
    static void bubbleSort(double[] a, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    double t= a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            n--;
        }
    }
    public static void main(String[] args) {
        double []a= new double[1000];
        for(int i=0;i<a.length;i++) a[i] = rd.nextInt(10000) + rd.nextDouble();

        bubbleSort(a,a.length);
        for(int i=0;i<a.length;i++) System.out.println(a[i]);
    }
}
