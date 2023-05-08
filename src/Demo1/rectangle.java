package Demo1;

/**
 * 设计一个长方形类，有两个属性（长度和宽度），有求面积的方法。编写主类测试其正确性。
 */
public class rectangle {
    //私有字段
    private double length;
    private double wide;
    //面积方法
   public double area(){
       return length*wide;
   }
//构造方法和get set方法
    public rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
}
