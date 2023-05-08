package myException;

/**
 * 自定义的错误类型，
 * 错误一，打不开文件
 * 错误二，文件找不到
 * 错误三，
 */
public class fileException extends Exception{
    public fileException() {
        super(" 我自定义的错1 ：打开失败");
    }
}
class FileOpenException extends Exception {
    public FileOpenException() {
        super("文件打开异常,系统找不到文件");
    }
}

class FileReadException extends Exception {
    public FileReadException() {
        super("文件读取异常");
    }
}