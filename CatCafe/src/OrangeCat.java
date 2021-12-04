//导入随机数
import java.util.Random;
//继承Cat
public class OrangeCat extends Cat{
    //成员变量
    boolean isFat;
    //父类构造
    public OrangeCat() {
        super();
    }
    //含参方法
    public OrangeCat(String name, int age, boolean isMale) {
        super(name, age, isMale);
        this.price = 200;
        //判断买的那只橘猫胖不胖
        Random flag = new Random();
        int n = flag.nextInt(2);
        this.isFat = n == 1;
    }


    //抽象方法重写
    @Override
    public String toString() {
        return  name +
                "被狠狠的rua了{" +
                "姓名：" + name +
                ", 年龄：" + age + "岁" +
                ", 是不是雄性：" + isMale +
                ", 肥胖：" + isFat +
                '}';
    }
}
