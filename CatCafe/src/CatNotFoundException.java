//定义的异常类需要继承异常类
public class CatNotFoundException extends RuntimeException{
    //构造器
    public CatNotFoundException(){
    }
    //重写错误信息
    @Override
    public String toString() {
        return "店里面没有猫猫在营业。";
    }
}