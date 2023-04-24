package Demo1;
public class count{
    private double score1;
    private double score2;
    private double score3;

    public count() {
    }

    public count(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }

    public double getTotal() {
        return score1 + score2 + score3;
    }
}