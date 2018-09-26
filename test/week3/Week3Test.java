package week3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Week3Test {
    // TODO: Viết 5 testcase cho phương thức max()

    /**
     * hàm test Chương trình tìm giá trị lớn nhất của hai số nguyên
     */
    @Test
    void testmax() {
        assertEquals(6, Week3.max(6, 2));
        assertEquals(1000, Week3.max(1000, 2));
        assertEquals(999, Week3.max(999, -2000));
        assertEquals(0, Week3.max(0, -999));
        assertEquals(-8, Week3.max(-8, -62));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()

    /**
     * hàm test Chương trình tìm giá trị nhỏ nhất của của một mảng số nguyên
     */
    @Test
    void testminOfArray() {
        int[] ar1 = new int[5];
        int[] ar2 = new int[5];
        int[] ar3 = new int[5];
        int[] ar4 = new int[5];
        int[] ar5 = new int[5];
        ar1[0] = 1;
        ar1[1] = 2;
        ar1[2] = 3;
        ar1[3] = 4;
        ar1[4] = 5;

        ar2[0] = 1;
        ar2[1] = 3;
        ar2[2] = 5;
        ar2[3] = 7;
        ar2[4] = 9;

        ar3[0] = -1;
        ar3[1] = -2;
        ar3[2] = -3;
        ar3[3] = -4;
        ar3[4] = -5;

        ar4[0] = 69;
        ar4[1] = 96;
        ar4[2] = 99;
        ar4[3] = 999;
        ar4[4] = 999;

        ar5[0] = 27;
        ar5[1] = 0;
        ar5[2] = 5;
        ar5[3] = 19;
        ar5[4] = 99;
        assertEquals(1, Week3.minOfArray(ar1));
        assertEquals(1, Week3.minOfArray(ar2));
        assertEquals(-5, Week3.minOfArray(ar3));
        assertEquals(69, Week3.minOfArray(ar4));
        assertEquals(0, Week3.minOfArray(ar5));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()

    /**
     * hàm test Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     */
    @Test
    void testcalculateBMI() {
        assertEquals("Bình thường", Week3.calculateBMI(57, 1.66));
        assertEquals("Bình thường", Week3.calculateBMI(90, 2));
        assertEquals("Béo phì", Week3.calculateBMI(199, 1.7));
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.7));
        assertEquals("Thừa cân", Week3.calculateBMI(64, 1.65));
    }
}
