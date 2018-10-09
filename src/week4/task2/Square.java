package week4.task2;

/**
 * đây là một class mô tả cơ bản về đối tượng Square kế thừa {@link Rectangle}
 *
 * @author manhung99
 */
public class Square extends Rectangle {
    private double side;//độ dài cạnh hình vuông

    /**
     * hàm khởi tạo không truyền vào tham số
     */
    public Square() {
    }

    /**
     * hàm khởi tạo truyền vào 1 tham số
     *
     * @param side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * hàm khởi tạo truyền vào 3 tham số
     *
     * @param side
     * @param color
     * @param filled
     */
    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    /**
     * hàm trả về độ dài cạnh hình vuông
     *
     * @return giá trị double là độ dài cạnh
     */
    public double getSide() {
        return side;
    }

    /**
     * hàm gán giá trị cho thuộc tính side
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * hàm gán giá trị cho thuộc tính width
     *
     * @param side
     */
    @Override
    public void setWidth(double side) {
        width = side;
    }

    /**
     * hàm gán giá trị cho thuộc tính length
     *
     * @param side
     */
    @Override
    public void setLength(double side) {
        length = side;
    }

    /**
     * hàm trả về thông tin của hình vuông
     *
     * @return giá trị String là thông tin
     */
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
