package week4.task1;

/**
 * đây là một class mô tả cơ bản về đối tượng hoa quả
 *
 * @author manhung99
 */
public class HoaQua {
    protected float price;//giá tiền
    protected float weight;//cân nặng

    /**
     * hàm trả về giá tiền của hoa quả
     *
     * @return giá trị float là giá tiền
     */
    public float getPrice() {
        return price;
    }

    /**
     * hàm gán giá trị cho thuộc tính price
     *
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * hàm trả về cân nặng của hoa quả
     *
     * @return giá trị float là cân nặng
     */
    public float getWeight() {
        return weight;
    }

    /**
     * hàm gán giá trị cho thuộc tính weight
     *
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
