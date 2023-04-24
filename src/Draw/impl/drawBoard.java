package Draw.impl;
/**
 * 这是一个画板
 */

import Draw.Shape;

import java.awt.*;
import java.util.ArrayList;

public class drawBoard  {
    private ArrayList<Shape> shapes = new ArrayList<>();
//    private Graphics g;

    public drawBoard() {

    }

    public void addShape(Shape s) {
       shapes.add(s);
    }

    public void show() {

        for (Shape s : shapes) {
            s.draw();
//            System.out.println(l.getStart().getX());
//            System.out.println(l.getStart().getY());
//            System.out.println(l.getEnd().getX());
//            System.out.println(l.getEnd().getY());
//            g.drawLine(1, 2, 3, 4);
        }

//        g.dispose();
    }
}
