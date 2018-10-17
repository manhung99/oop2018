package week5_6;

import java.util.Objects;

public class Square extends Rectangle {
    private Double side;
    private Point centerPoint;


    public Square(String color, boolean filled, Double side, Point centerPoint) {
        super(color, filled);
        this.side = side;
        this.centerPoint = centerPoint;
    }

    public Square(Double side, Point centerPoint) {
        this.side = side;
        this.centerPoint = centerPoint;
    }

    public Square() {
        this.side=1.0;
        centerPoint= new Point();
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", centerPoint=" + centerPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Objects.equals(side, square.side);
    }

}
