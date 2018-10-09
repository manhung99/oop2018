package week4.task2;

/**
 * đây là một class mô tả cơ bản về đối tượng Rectangle kế thừa {@link Shape}
 *
 * @author manhung99
 */
public class Rectangle extends Shape {
    protected double width = 1;//chiều rộng hình chữ nhật
    protected double length = 1;//chiều dài hình chữ nhật

    /**
     * hàm khởi tạo không truyền vào tham số
     */
    public Rectangle() {
    }

    /**
     * hàm khởi tạo truyền vào 2 tham số
     *
     * @param width
     * @param length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * hàm khởi tạo truyền vào 4 tham số
     *
     * @param width
     * @param length
     * @param color
     * @param filled
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * hàm trả về chiều rộng hình chữ nhật
     *
     * @return giá trị double là chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * hàm gán giá trị cho thuộc tính width
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * hàm trả về chiều dài hình chữ nhật
     *
     * @return giá trị double là chiều dài
     */
    public double getLength() {
        return length;
    }

    /**
     * hàm gán giá trị cho thuộc tính length
     *
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * hàm trả về diện tích hình chữ nhật
     *
     * @return giá trị double là diện tích
     */
    public double getArea() {
        return width * length;
    }

    /**
     * hàm trả về chu vi hình chữ nhật
     *
     * @return giá trị double là chu vi
     */
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * hàm trả về thông tin của hình chữ nhật
     *
     * @return giá trị String là thông tin
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
