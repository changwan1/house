//导入LocalDate类
import java.time.LocalDate;
public class Customer {
    LocalDate date;
    //变量
    public String name;
    public int times;
    //有参构造
    public Customer(String name, int times, LocalDate date) {
        this.name = name;
        this.times = times;
        this.date = date;
    }
    //构造器
    public Customer() {
    }
    //对object重写
    @Override
    public String toString() {
        return "顾客{" +
                "姓名：" + name +
                ", rua猫次数：" + times +
                ", 到店时间：" + date +
                '}';
    }
}