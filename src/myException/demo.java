package myException;

import java.io.*;

public class demo {
    public static void main(String[] args) {
        //案例1
       String fileName="C:\\Users\\26052\\Desktop\\Run\\Clin-Study\\de.txt";
        try {
            readFile(fileName);
        } catch (fileException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("文件读写错误");
        }

        //按行读写
        try {
            readFileLine(fileName);
        } catch (FileOpenException e) {
            e.printStackTrace();
        } catch (FileReadException e) {
            e.printStackTrace();
        }

        System.out.println("正常运行部分....");
        //案例2
        try {
            divide(1 ,0);
        } catch (DivisionException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("算术错误");
        }
        System.out.println("正常运行部分");


    }
    public static void readFile(String fileName) throws fileException {

        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            // 文件读取逻辑
        } catch (FileNotFoundException e) {
            throw new fileException();
        }
    }
    public static int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException();
        }
        return a / b;
    }
    public static void readFileLine(String fileName) throws FileOpenException, FileReadException {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new FileOpenException();
        }
    }
}
