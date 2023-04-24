package Demo1;

public class rectangle {
    private double length;
    private double wide;
   public double area(){
       return length*wide;
   }

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
