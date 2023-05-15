package Swing;

import Swing.Student.MainForm;
import Swing.Student.StudentForm;
import Swing.Student.loginForm;

/**
 * 测试用例
 */
public class demo {
    public static void main(String[] args) {
        //创建主窗口对象并显示
//        StudentForm frm = new StudentForm();
//        frm.setVisible(true);
        loginForm fr=new loginForm();
        fr.setVisible(true);
        MainForm mainForm=MainForm.getInstance();
        mainForm.setVisible(true);
    }
}
