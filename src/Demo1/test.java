package Demo1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        实验任务1、设计一个动物类，有颜色和重量两个属性，有吃东西的方法，定义一个构造方法给属性赋值，
//        使用构造方法创建动物对象并调用吃东西的方法。编写主类测试其正确性。
        animal an=new cat();
        an.setColor("黄色");
        an.eat();


//        实验任务2、设计一个长方形类，有两个属性（长度和宽度），有求面积的方法。编写主类测试其正确性
//

        rectangle re=new rectangle(3,4);
        System.out.println("长为3，宽为4的长方形面积为");
        System.out.println(re.area());




//        实验任务3、从键盘上输入三门课的分数，计算三门课的平均分和总成绩。设计一个成绩计算类实现上述功能，并编写主类测试其正确性。
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第1门课成绩:");
        double score1 = scanner.nextDouble();
        System.out.print("请输入第2门课成绩:");
        double score2 = scanner.nextDouble();
        System.out.print("请输入第3门课成绩:");
        double score3 = scanner.nextDouble();

        // 创建Score对象并获取平均分和总分
        count score = new count(score1, score2, score3);
        double average = score.getAverage();
        double total = score.getTotal();

        // 打印平均分和总分
        System.out.println("三门课的平均分是:" + average);
        System.out.println("三门课的总分是:" + total);





//        实验任务4、设计一个圆类，该类有半径属性和计算圆面积的方法。编写主类测试其正确性。
// 从键盘输入圆的半径
        System.out.print("请输入圆的半径:");
        double radius = scanner.nextDouble();

        // 创建Circle对象并获取面积
        Circle circle = new Circle(radius);
        double area = circle.getArea();

        // 打印圆的面积
        System.out.println("圆的面积是:" + area);

    }
}
