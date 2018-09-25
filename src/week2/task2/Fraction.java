package week2.task2;

import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    public int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if (denominator == 0) {
            System.out.println("Error denominator = 0");
            return;
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    //giản ước phân số
    public void fractionaldivisors() {
        int gcd = Task1.gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if (this.denominator == 0 || other.denominator == 0) {
            System.out.println("Error denominator = 0");
            return null;
        }
        Fraction sum = new Fraction(this.numerator * other.denominator + this.denominator * other.numerator, this.denominator * other.denominator);
        sum.fractionaldivisors();
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        if (this.denominator == 0 || other.denominator == 0) {
            System.out.println("Error denominator = 0");
            return null;
        }
        Fraction sub = new Fraction(this.numerator * other.denominator - this.denominator * other.numerator, this.denominator * other.denominator);
        sub.fractionaldivisors();
        return sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        if (this.denominator == 0 || other.denominator == 0) {
            System.out.println("Error denominator = 0");
            return null;
        }
        Fraction mul = new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
        mul.fractionaldivisors();
        return mul;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        if (this.denominator == 0 || other.denominator == 0) {
            System.out.println("Error denominator = 0");
            return null;
        }
        else if(other.numerator==0){
            System.out.println("Can not divided!!!");
            return null;
        }
        Fraction div = new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
        div.fractionaldivisors();
        return div;
    }

    //hàm so sánh 2 phân số
    public boolean equals(Fraction other){
        if (this.denominator == 0 || other.denominator == 0) {
            System.out.println("Error denominator = 0");
        }
        Fraction temp=this.subtract(other);
        if(temp.numerator==0) return true;
        return false;
    }

    //hàm hiển thị phân số
    public void displayFraction(){
        if(this.denominator==1){
            System.out.println(this.numerator);
        }
        else if(this.denominator==-1){
            System.out.println(-this.numerator);
        }
        else if(this.numerator==0){
            System.out.println(0);
        }
        else if(this.numerator==this.denominator){
            System.out.println(1);
        }
        else if(this.numerator==-this.denominator){
            System.out.println(-1);
        }
        else if(this.denominator<0){

            System.out.println(-this.numerator+"/"+(-this.denominator));
        }
        else {
            System.out.println(this.numerator+"/"+this.denominator);
        }
    }

    public static void main(String[] args) {
        Fraction t1 = new Fraction(1, 2);
        Fraction t2 = new Fraction(3, 4);
        Fraction sum = t1.add(t2);
        Fraction sub = t1.subtract(t2);
        Fraction mul = t1.multiply(t2);
        Fraction div = t1.divide(t2);
    }
}
