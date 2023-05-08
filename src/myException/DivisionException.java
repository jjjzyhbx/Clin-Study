package myException;

public class DivisionException extends Exception {
    public DivisionException() {
        super("除数不能为0");
    }
}
