package Swing.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentForm extends JFrame {

    //定义组件
    private JPanel panelLeft;  //左面板
    private JPanel panelRight; //右面板
    private JLabel lblTitle;   //标题标签
    private JLabel lblName;    //姓名标签
    private JTextField txtName;//姓名文本框
    private JLabel lblGender;  //性别标签
    private JRadioButton rdoMale;   //男单选按钮
    private JRadioButton rdoFemale; //女单选按钮
    private JLabel lblAge;     //年龄标签
    private JTextField txtAge;   //年龄文本框
    private JButton btnSubmit;  //提交按钮
    private JButton btnLogin;//登录

    private JLabel lblMainTitle;  //主标题标签
    private JLabel lblSubTitle1; //导入数据标题标签
    private JLabel lblSubTitle2; //查询数据标题标签
    private JLabel lblSubTitle3; //修改数据标题标签
    private JLabel lblSubTitle4; //显示信息标题标签
    private JLabel lblSubTitle5; //退出标题标签

    public StudentForm() {

        //设置标题,大小
        setTitle("学生信息管理系统");
        setSize(800, 600);
        setLayout(new BorderLayout());   //设置BorderLayout布局

        //标题标签
        lblTitle = new JLabel("学生信息管理", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 20));

        add(lblTitle, BorderLayout.NORTH);



        //左面板
        panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(200, 500));
        add(panelLeft, BorderLayout.WEST);

        //右面板
        panelRight = new JPanel();
        panelRight.setPreferredSize(new Dimension(600, 500));
        add(panelRight, BorderLayout.EAST);
//
//        //姓名标签和文本框
//        lblName = new JLabel("姓名:");
//        lblName.setFont(new Font("Arial", Font.PLAIN, 15));
//        panelLeft.add(lblName);
//        txtName = new JTextField(15);
//        txtName.setFont(new Font("Arial", Font.PLAIN, 15));
//        panelLeft.add(txtName);
//
//        //性别标签,单选按钮
//        lblGender = new JLabel("性别:");
//        lblGender.setFont(new Font("Arial", Font.PLAIN, 15));
//        panelLeft.add(lblGender);
//        rdoMale = new JRadioButton("男");
//        rdoFemale = new JRadioButton("女");
//        ButtonGroup bg = new ButtonGroup();
//        bg.add(rdoMale);
//        bg.add(rdoFemale);
//        panelLeft.add(rdoMale);
//        panelLeft.add(rdoFemale);
//
//        //年龄标签和文本框
//        lblAge = new JLabel("年龄:");
//        lblAge.setFont(new Font("Arial", Font.PLAIN, 15));
//        panelLeft.add(lblAge);
//        txtAge = new JTextField(3);
//        txtAge.setFont(new Font("Arial", Font.PLAIN, 15));
//        panelLeft.add(txtAge);
//
//        //提交按钮
//        btnSubmit = new JButton("提交");
//        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 12));
//        panelLeft.add(btnSubmit);

        //提交按钮事件
//        btnSubmit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //获取输入信息
//                String name = txtName.getText();
//                String gender = rdoMale.isSelected() ? "男" : "女";
//                int age = Integer.parseInt(txtAge.getText());
//                //显示弹窗
//                JOptionPane.showMessageDialog(StudentForm.this,
//                        "学生信息:\n" +
//                                "姓名:" + name + "\n" +
//                                "性别:" + gender + "\n" +
//                                "年龄:" + age);
//            }
//        });
        //登录按钮
        btnLogin = new JButton("登录");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //创建登录窗口对象并显示
                loginForm frm = new loginForm();
                frm.pack();  //设置登录窗口大小
                frm.setLocationRelativeTo(StudentForm.this); //中心显示
                frm.setVisible(true);
            }
        });
        panelLeft.add(btnLogin);
    }
}
