package Draw.impl;
/**
 * 这是一个线类，实现了接口
 */

import Draw.Shape;

public class Line implements Shape {
    private Dot start;
    private Dot end;
    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void draw() {
//        System.out.print("Line from ");
//        start.draw();
//        System.out.print(" -> ");
//        end.draw();
//        System.out.println();
        System.out.println(toString());
    }

    public Dot getStart() {
        return start;
    }

    public void setStart(Dot start) {
        this.start = start;
    }

    public Dot getEnd() {
        return end;
    }

    public void setEnd(Dot end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                 start.toString() +
                "<->" + end.toString() +
                '}';
    }
}
