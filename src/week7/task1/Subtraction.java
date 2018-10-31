package week7.task1;

public class Subtraction extends BinaryExpression{
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return left.evaluate()-right.evaluate();
    }

    @Override
    Expression left() {
        return this.left;
    }

    @Override
    Expression right() {
        return this.right;
    }
}
