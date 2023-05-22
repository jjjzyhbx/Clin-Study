package Swing.Student;

import Swing.userData.utils;

public class test {
    public static void main(String[] args) {
        studentBean s=new studentBean();
        System.out.println(utils.objectToJson(s));
    }
}
