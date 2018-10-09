package week4.task1;

/**
 * đây là một class mô tả cơ bản về đối tượng quả táo kế thừa {@link HoaQua}
 *
 * @author manhung99
 */
public class Tao {
    protected String smell;//mùi vị
    protected String taste;//vị

    /**
     * hàm trả về mùi vị của quả táo
     *
     * @return giá trị String là mùi vị
     */
    public String getSmell() {
        return smell;
    }

    /**
     * hàm gán giá trị cho thuộc tính smell
     *
     * @param smell
     */
    public void setSmell(String smell) {
        this.smell = smell;
    }

    /**
     * hàm trả về vị của quả táo
     *
     * @return giá trị String là vị
     */
    public String getTaste() {
        return taste;
    }

    /**
     * hàm gán giá trị cho thuộc tính taste
     *
     * @param taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }
}
