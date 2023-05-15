package Draw.impl;
/**
 * 这是一个画板
 */

import Draw.Shape;
import java.util.ArrayList;

public class drawBoard  {
    private ArrayList<Shape> shapes = new ArrayList<>();
    public drawBoard() {
    }
    //将图案添加到画板中
    public void addShape(Shape s) {
       shapes.add(s);
    }
    //实现画板绘制方法
    public void show() {
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
