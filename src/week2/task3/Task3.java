package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới


//Con mèo nhà em:)
class Cat {
    private String color, gen;// màu sắc, kiểu gen mèo
    private int weight;//cân nặng

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    //mèo kêu
    public void sound() {
        System.out.println("Meo Meo");
    }

    //so sánh gen của mèo
    public boolean samegen(Cat c1, Cat c2) {
        if (c1.getGen() == null || c2.getGen() == null) return false;
        if (c1.getGen().equals(c2.getGen())) return true;
        return false;
    }

    //so sánh màu sắc của mèo
    public boolean samecolor(Cat c1, Cat c2) {
        if (c1.getColor() == null || c2.getColor() == null) return false;
        if (c1.getColor().equals(c2.getColor())) return true;
        return false;
    }

}

//Cái cây nhà hàng xóm-.-
class tree {
    private String name, color;//tên cây,màu lá của cây
    private int height;//chiều cao của cây

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //so sánh chiều cao 2 cây
    public boolean sameheight(tree t1, tree t2) {
        if (t1.getHeight() == '\0' || t2.getHeight() == '\0') return false;
        if (t1.getHeight() == t2.getHeight()) return true;
        return false;
    }

    //tăng x đơn vị chiều cao cho cây
    public void growup(int x) {
        this.height += x;
    }

    //chuyển màu lá cho cây VD: khi sang mua thu!
    public void changecolor(String x) {
        this.color = x;
    }
}

//Tài khoản ngân hàng
class bankId {
    public String id, name;//mã số tài khoản ngân hàng,tên chủ thẻ
    public double balance;//số dư tài khoản

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //cộng thêm x USD vào tài khoản và in ra số dư còn lại
    public void addmoney(double x) {
        this.balance += x;
        System.out.println("Your account balance: " + balance);
    }

    //rút x USD ra khỏi tài khoản và in ra số dư còn lại
    public void withdraw(double x) {
        if (x > this.balance) System.out.println("Can not withdraw money");
        else {
            this.balance -= x;
            System.out.println("Your account balance: " + balance);
        }
    }

    //in ra toàn bộ thông tin tài khoản
    public String getInfo() {
        return "ID: " + id + '|' +
                "Name: " + name + '|' +
                "Balance: " + balance;
    }
}