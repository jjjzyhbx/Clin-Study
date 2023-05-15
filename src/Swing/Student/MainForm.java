package Swing.Student;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.这是一个主窗口,居中
 * 2.该窗口单例,只可存在一个
 * 3.该窗口为学生信息管理系统的主页,
 * 4.该窗口为学生信息管理系统的导航页
 * 5.该窗口有 数据查询,数据导入导出 数据展示等功能导航
 */
public class MainForm extends JFrame {

    private static MainForm instance;   //单例

    private JMenuBar menuBar;   //菜单条
    private JMenu menuFile;     //文件菜单
    private JMenuItem mntmImport;   //导入菜单项
    private JMenuItem mntmQuery;   //查询菜单项
    private JMenuItem mntmModify;  //修改菜单项
    private JMenuItem mntmShow;    //展示菜单项
    private JMenuItem mntmExit;    //退出菜单项
    private MainForm() {
        //设置居中
        setSize(800, 600);
        setLocationRelativeTo(null);

        // ...
        //添加标题
        JLabel lblTitle = new JLabel("学生信息管理系统");
        add(lblTitle, BorderLayout.NORTH);

        //添加菜单条及各菜单
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        /**
         * 在菜单导航中显示
         */
        menuFile = new JMenu("文件(F)");
        menuBar.add(menuFile);
        //        导入菜单项
        mntmImport = new JMenuItem("导入(I)");
        mntmImport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //打开数据导入窗口
                StudentForm frm = new StudentForm();
                frm.setVisible(true);
            }
        });
        menuFile.add(mntmImport);


        
        menuFile = new JMenu("菜单1");
        menuBar.add(menuFile);
        menuFile = new JMenu("菜单2");
        menuBar.add(menuFile);
        menuFile = new JMenu("菜单3");
        menuBar.add(menuFile);


        //...其他菜单项和事件类似

        //退出菜单项
        mntmExit = new JMenuItem("退出(X)");
        mntmExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  //退出系统
            }
        });
        menuFile.add(mntmExit);
    }

    public static MainForm getInstance() {
        if (instance == null) {
            instance = new MainForm();
        }
        return instance;
    }
}
