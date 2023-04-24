package Draw.impl;
/**
 * 这是一个点
 */

import Draw.Shape;
public class Dot implements Shape {
    private int x;
    private int y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "(" +
                  x +
                ", " + y +
                ')';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
