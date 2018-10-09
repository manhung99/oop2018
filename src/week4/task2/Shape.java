package week4.task2;

/**
 * đây là một class mô tả cơ bản về đối tượng Shape
 *
 * @author manhung99
 */

public class Shape {
    protected String color = "red";//màu sắc
    protected boolean filled = true;//true là hình _____ false là đường bao quanh hình

    /**
     * hàm khởi tạo không truyền vào tham số
     */
    Shape() {
    }

    /**
     * hàm khởi tạo truyền vào 2 tham số
     *
     * @param color
     * @param filled
     */
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * hàm trả về màu sắc
     *
     * @return giá trị String là màu sắc
     */
    public String getColor() {
        return color;
    }

    /**
     * hàm gán giá trị cho thuộc tính color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * hàm trả về true hoặc false
     *
     * @return giá trị boolean
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * hàm gán giá trị cho thuộc tính filled
     *
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * hàm trả về thông tin của hình
     *
     * @return giá trị String là thông tin
     */
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
