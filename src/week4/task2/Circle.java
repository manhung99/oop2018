package week4.task2;

/**
 * đây là một class mô tả cơ bản về đối tượng Circle kế thừa {@link Shape}
 *
 * @author manhung99
 */
public class Circle extends Shape {
    private double radius = 1;//bán kính hình tròn
    private final double PI = 3.14f;//định nghĩa số PI là hằng số

    /**
     * hàm khởi tạo không truyền vào tham số
     */
    public Circle() {
    }

    /**
     * hàm khởi tạo truyền vào 1 tham số
     *
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * hàm khởi tạo truyền vào 3 tham số
     *
     * @param radius
     * @param color
     * @param filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * hàm trả về bán kính hình  tròn
     *
     * @return giá trị double là bán kính
     */
    public double getRadius() {
        return radius;
    }

    /**
     * hàm gán giá trị cho thuộc tính radius
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * hàm trả về diện tích hình tròn
     *
     * @return giá trị double là diện tích
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * hàm trả về chu vi hình tròn
     *
     * @return giá trị double là chu vi
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * hàm trả về thông tin của hình tròn
     *
     * @return giá trị String là thông tin
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        Circle t1 = new Circle();
        Circle t2 = new Circle(10);
        Circle t3 = new Circle(10, "white", false);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());

        System.out.println(t1.getArea() + " " + t1.getPerimeter());


    }
}
