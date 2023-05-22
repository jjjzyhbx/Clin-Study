package Swing.Student;

/**
 * 这是一个学生成绩类
 * 包含各科成绩
 */
public class grade {
    private double chineseGrade;  // 语文成绩
    private double mathGrade;     // 数学成绩
    private double englishGrade;  // 英语成绩

    public grade(double chineseGrade, double mathGrade, double englishGrade) {
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    public double getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(double chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    @Override
    public String toString() {
        return "grade{" +
                "chineseGrade=" + chineseGrade +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                '}';
    }
    /**
     * 将grade对象转换为JSON字符串
     *
     * @return JSON字符串
     */
    public String toJsonString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        sb.append("\"chineseGrade\":");
        sb.append(this.chineseGrade);
        sb.append(",");

        sb.append("\"mathGrade\":");
        sb.append(this.mathGrade);
        sb.append(",");

        sb.append("\"englishGrade\":");
        sb.append(this.englishGrade);

        sb.append("}");
        return sb.toString();
    }
}