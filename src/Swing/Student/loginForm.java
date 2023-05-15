package Swing.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JFrame {

    //定义组件
    private JPanel panel;     //面板
    private JLabel lblUsername;//用户名标签
    private JTextField txtUsername;//用户名文本框
    private JLabel lblPassword;  //密码标签
    private JPasswordField txtPassword;//密码文本框
    private JButton btnLogin;   //登录按钮
    private JButton btnCancel;  //取消按钮

    public loginForm() {
        //设置标题,大小
        //设置标题
        setTitle("登录");

        //设置窗体大小及GridLayout布局
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
//设置组件大小
//        lblUsername.setPreferredSize(new Dimension(60, 25));
//        txtUsername.setPreferredSize(new Dimension(200, 25));
//        lblPassword.setPreferredSize(new Dimension(60, 25));
//        txtPassword.setPreferredSize(new Dimension(200, 25));
//        btnLogin.setPreferredSize(new Dimension(100, 30));
//        btnCancel.setPreferredSize(new Dimension(100, 30));
        panel = new JPanel();
        add(panel);

        //用户名标签和文本框
        lblUsername = new JLabel("用户名:");
        panel.add(lblUsername);
        txtUsername = new JTextField(15);
        panel.add(txtUsername);

        //密码标签和文本框
        lblPassword = new JLabel("密 码:");
        panel.add(lblPassword);
        txtPassword = new JPasswordField(15);
        panel.add(txtPassword);

        //登录按钮
        btnLogin = new JButton("登录");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取输入信息
                String username = txtUsername.getText();
                String password = txtPassword.getText();
                //验证用户名和密码
                if ("admin".equals(username) && "123456".equals(password)) {
                    JOptionPane.showMessageDialog(loginForm.this, "登录成功!");
                    dispose();    //关闭登录窗口
                    new StudentForm().setVisible(true);   //打开主窗口
                } else {
                    JOptionPane.showMessageDialog(loginForm.this, "用户名或密码错误!");
                }
            }
        });
        panel.add(btnLogin);

        //取消按钮
        btnCancel = new JButton("取消");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();   //关闭窗口
            }
        });
        panel.add(btnCancel);
    }
}
