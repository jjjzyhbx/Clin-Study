package Swing.Student;

/**
 * 学生管理系统的学生类，
 * 字段1，学生姓名
 * 字段2，学生id
 * 字段3，学生成绩grade
 * 字段4，学生其他信息
 */
public class studentBean {
    private String name;   // 学生姓名
    private int id;        // 学生id
    private grade grade;   // 学生成绩
    private String otherInfo;  // 学生其他信息

    public studentBean(String name, int id, grade grade, String otherInfo) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.otherInfo = otherInfo;
    }
    public studentBean(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public grade getGrade() {
        return grade;
    }

    public void setGrade(grade grade) {
        this.grade = grade;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    /**
     * 将studentBean对象转换为JSON字符串
     *
     * @return JSON字符串
     */
    public String toJsonString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        // 添加name字段
        sb.append("\"name\":");
        sb.append("\"");
        sb.append(this.name);
        sb.append("\"");
        sb.append(",");

        // 添加id字段
        sb.append("\"id\":");
        sb.append(this.id);
        sb.append(",");

        // 添加grade字段
        sb.append("\"grade\":");
        sb.append(this.grade.toJsonString());
        sb.append(",");

        // 添加otherInfo字段
        sb.append("\"otherInfo\":");
        sb.append("\"");
        sb.append(this.otherInfo);
        sb.append("\"");

        sb.append("}");
        return sb.toString();
    }
}