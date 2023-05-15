package Draw.impl;
/**
 * 这是一个面，包含三个点
 */

import Draw.Shape;
public class Triangle implements Shape {
    private Dot d1;
    private Dot d2;
    private Dot d3;
    public Triangle() {
    }
    public Triangle(Dot d1, Dot d2, Dot d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public Dot getD1() {
        return d1;
    }
    public void setD1(Dot d1) {
        this.d1 = d1;
    }
    public Dot getD2() {
        return d2;
    }
    public void setD2(Dot d2) {
        this.d2 = d2;
    }
    public Dot getD3() {
        return d3;
    }
    public void setD3(Dot d3) {
        this.d3 = d3;
    }
    //绘制方法
    @Override
    public void draw() {
        // 绘制三角形面，通过绘制三条线来表示一个面
        Line line1 = new Line(d1, d2);
        Line line2 = new Line(d2, d3);
        Line line3 = new Line(d3, d1);
        line1.draw();
        line2.draw();
        line3.draw();
    }

}
