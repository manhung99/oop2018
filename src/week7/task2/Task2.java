package week7.task2;

import week7.task1.Division;
import week7.task1.Expression;
import week7.task1.Numeral;

import java.io.*;

class A {
}

class B extends A {
}

public class Task2 {
    static BufferedReader bufferedReader = null;

    public static void getNullPointerException(Expression e) throws NullPointerException {
        System.out.println(e.toString());
    }

    public static void getArrayIndexOfBoundException(int[] a, int x) throws ArrayIndexOutOfBoundsException {
        System.out.println(a[x]);
    }

    public static void getArithmeticException(Division division) throws ArithmeticException {
        System.out.println(division.evaluate());
    }

    public static void getClassCastException() throws ClassCastException {
        A a = new A();
        B b = (B) a;
    }

    public static void getFileNotFoundException() throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader("abc.txt"));
    }

    public static void getIOException() throws IOException {
        bufferedReader = new BufferedReader(new FileReader("abc.txt"));
    }


    public static void main(String[] args) {
        Expression expression = null;

        int[] a = {1, 2, 3};

///////////////////////////////////////////////////////////////////////////////////////////////////

        Division division = new Division(new Numeral(10), new Numeral(0));

        try {
            //getNullPointerException(expression);
            //getArrayIndexOfBoundException(a,5);
            //getArithmeticException(division);
            //getClassCastException();
            //getIOException();
            getFileNotFoundException();
        } catch (NullPointerException e) {
            System.out.println("lỗi NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("lỗi ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("lỗi ArithmeticException");
        } catch (ClassCastException e) {
            System.out.println("lỗi ClassCastException");
        } catch (IOException e) {
            System.out.println("lỗi IOException");
        }/*catch (FileNotFoundException e){
            System.out.println("lỗi FileNotFoundException");
        }*/


    }
}
