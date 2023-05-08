package Demo1;
public class count{
    //私有课程分数字段
    private double score1;
    private double score2;
    private double score3;
//构造方法
    public count() {
    }

    public count(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
//平均分
    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }
//总分
    public double getTotal() {
        return score1 + score2 + score3;
    }
}