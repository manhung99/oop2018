package week4.task1;

/**
 * đây là một class mô tả cơ bản về đối tượng cam cao phong kế thừa {@link Cam}
 *
 * @author manhung99
 */
public class CamCaoPhong extends Cam {
    private String color;//màu sắc
    private String shape;//hình dạng

    /**
     * hàm trả về màu sắc của cam cao phong
     *
     * @return giá trị String là màu
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
     * hàm trả về hình dạng của cam cao phong
     *
     * @return giá trị String là hình dạng
     */
    public String getShape() {
        return shape;
    }

    /**
     * hàm gán giá trị cho thuộc tính shape
     *
     * @param shape
     */
    public void setShape(String shape) {
        this.shape = shape;
    }
}
