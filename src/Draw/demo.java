package Draw;

import Draw.impl.Dot;
import Draw.impl.Line;
import Draw.impl.Triangle;
import Draw.impl.drawBoard;

import java.awt.*;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        drawBoard board = new drawBoard();

        while (true) {
            int choice = showMenu();
            if (choice == 1) {     // 选择画点
                System.out.println("点如下");
                board.addShape(getDot());
            } else if (choice == 2) {  // 选择画线
                System.out.println("线如下");
                board.addShape(new Line(getDot(), getDot()));
            } else if (choice == 3) {   // 选择画三角形面
                Dot d1 = getDot();
                Dot d2 = getDot();
                Dot d3 = getDot();
                System.out.println("三角面如下");
                board.addShape(new Triangle(d1, d2, d3));
            }
            board.show();   // 显示图形
        }
    }

    // 显示菜单
    private static int showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("请选择:");
        System.out.println("1. 画点");
        System.out.println("2. 画线");
        System.out.println("3. 画三角形面");
        int choice = in.nextInt();
        return choice;
    }

    // 获得画点位置
    private static Dot getDot() {
        System.out.println("请输入点的x和y坐标:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        return new Dot(x, y);
    }
}
