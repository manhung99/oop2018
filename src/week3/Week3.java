package week3;

public class Week3 {
    /**
     * Chương trình tìm giá trị lớn nhất của hai số nguyên
     *
     * @param m số nguyên thứ nhất
     * @param n số nguyên thứ hai
     * @return số lớn nhất trong của hai số
     */
    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m > n) return m;
        return n;
    }

    /**
     * Chương trình tìm giá trị nhỏ nhất của của một mảng số nguyên
     *
     * @param array mảng cần tìm
     * @return giá trị nhỏ nhất của mảng
     */
    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int minofA = 999999;
        for (int i = 0; i < 5; i++) if (array[i] < minofA) minofA = array[i];
        return minofA;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     *
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight / height / height;
        if (BMI < 18.5) return "Thiếu cân";
        else if (BMI >= 18.5 && BMI < 23) return "Bình thường";
        else if (BMI >= 23 && BMI < 25) return "Thừa cân";
        return "Béo phì";
    }

    public static void main(String[] args) {
        int[] ar = {1,2,-39,4,5};
        System.out.println(minOfArray(ar));
        System.out.println(calculateBMI(57,1.66));
    }
}
