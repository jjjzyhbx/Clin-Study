package Demo1;

/**
 *  实验任务4、设计一个圆类，该类有半径属性和计算圆面积的方法。编写主类测试其正确性。
 *  从键盘输入圆的半径
 */
public class Circle {
    //半径
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }
//获得面积
    public double getArea() {
        //调用专用Math类中静态字段Pi
        return Math.PI * radius * radius;
    }
}