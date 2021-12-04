//定义的异常类需要继承异常类
public class InsufficientBalanceException extends RuntimeException{
    //构造器
    public InsufficientBalanceException() {
    }
    //重写错误信息
    @Override
    public String toString() {
        return "店内余额不足!!!程序产生错误！！！";
    }
}
